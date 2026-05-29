package com.demo

fun main() {
    val manager = TaskManager()
    manager.addTask("Setup CI/CD pipeline")
    manager.addTask("Write unit tests")
    manager.addTask("Deploy to production")

    manager.updateStatus(1, TaskStatus.DONE)
    manager.updateStatus(2, TaskStatus.IN_PROGRESS)

    println("=== Task Manager Demo ===")
    TaskStatus.entries.forEach { status ->
        val tasks = manager.getByStatus(status)
        if (tasks.isNotEmpty()) println("[$status] ${tasks.map { it.title }}")
    }
}
