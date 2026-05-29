package com.demo

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TaskManagerTest {

    private lateinit var manager: TaskManager

    @BeforeEach
    fun setUp() {
        manager = TaskManager()
    }

    @Test
    fun `addTask creates task with TODO status`() {
        val task = manager.addTask("Write tests")
        assertEquals("Write tests", task.title)
        assertEquals(TaskStatus.TODO, task.status)
    }

    @Test
    fun `addTask assigns sequential ids`() {
        val first = manager.addTask("First")
        val second = manager.addTask("Second")
        assertEquals(1, first.id)
        assertEquals(2, second.id)
    }

    @Test
    fun `addTask trims whitespace from title`() {
        val task = manager.addTask(" trimmed ")
        assertEquals("trimmed", task.title)
    }

    @Test
    fun `addTask throws on blank title`() {
        assertThrows<IllegalArgumentException> { manager.addTask(" ") }
    }

    @Test
    fun `updateStatus changes task status`() {
        val task = manager.addTask("Deploy")
        val updated = manager.updateStatus(task.id, TaskStatus.IN_PROGRESS)
        assertEquals(TaskStatus.IN_PROGRESS, updated.status)
    }

    @Test
    fun `updateStatus throws when task not found`() {
        assertThrows<IllegalStateException> { manager.updateStatus(999, TaskStatus.DONE) }
    }

    @Test
    fun `getByStatus returns only matching tasks`() {
        manager.addTask("A")
        val b = manager.addTask("B")
        manager.updateStatus(b.id, TaskStatus.DONE)

        val done = manager.getByStatus(TaskStatus.DONE)
        assertEquals(1, done.size)
        assertEquals("B", done.first().title)
    }

    @Test
    fun `getAll returns all tasks`() {
        manager.addTask("X")
        manager.addTask("Y")
        assertEquals(2, manager.getAll().size)
    }

    @Test
    fun `remove deletes task by id`() {
        val task = manager.addTask("To remove")
        assertTrue(manager.remove(task.id))
        assertTrue(manager.getAll().isEmpty())
    }

    @Test
    fun `remove returns false for unknown id`() {
        assertFalse(manager.remove(42))
    }
}