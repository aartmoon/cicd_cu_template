package com.demo

enum class TaskStatus { TODO, IN_PROGRESS, DONE }

data class Task(
    val id: Int,
    val title: String,
    val status: TaskStatus = TaskStatus.TODO
)

class TaskManager {
    private val tasks = mutableListOf<Task>()
    private var nextId = 1

    fun addTask(title: String): Task {
        require(title.isNotBlank()) { "Title must not be blank" }
        val task = Task(id = nextId++, title = title.trim())
        tasks.add(task)
        return task
    }

    fun updateStatus(id: Int, status: TaskStatus): Task {
        val index = tasks.indexOfFirst { it.id == id }
        check(index >= 0) { "Task $id not found" }
        val updated = tasks[index].copy(status = status)
        tasks[index] = updated
        return updated
    }

    fun getByStatus(status: TaskStatus): List<Task> =
        tasks.filter { it.status == status }

    fun getAll(): List<Task> = tasks.toList()

    fun remove(id: Int): Boolean =
        tasks.removeIf { it.id == id }
}
