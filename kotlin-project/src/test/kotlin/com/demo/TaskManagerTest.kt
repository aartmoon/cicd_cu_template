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

    // TODO: [Задание 1] Напишите тест, который проверяет:
    //   - addTask создаёт задачу со статусом TODO
    //   - title задачи совпадает с переданным
    @Test
    fun `addTask creates task with correct title and TODO status`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 2] Напишите тест на последовательное присвоение id.
    //   Добавьте две задачи и убедитесь, что id = 1 и id = 2.
    @Test
    fun `addTask assigns sequential ids`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 3] Проверьте, что addTask обрезает пробелы у title.
    @Test
    fun `addTask trims whitespace from title`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 4] Проверьте, что addTask бросает IllegalArgumentException
    //   при передаче пустой строки или строки из пробелов.
    @Test
    fun `addTask throws on blank title`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 5] Проверьте, что updateStatus меняет статус задачи.
    @Test
    fun `updateStatus changes task status`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 6] Проверьте, что updateStatus бросает IllegalStateException
    //   при несуществующем id (например, 999).
    @Test
    fun `updateStatus throws when task not found`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 7] Добавьте несколько задач с разными статусами.
    //   Проверьте, что getByStatus возвращает только задачи с нужным статусом.
    @Test
    fun `getByStatus returns only matching tasks`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 8] Проверьте, что getAll возвращает все добавленные задачи.
    @Test
    fun `getAll returns all tasks`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 9] Проверьте, что remove удаляет задачу по id
    //   и возвращает true. После удаления getAll должен вернуть пустой список.
    @Test
    fun `remove deletes task by id`() {
        TODO("Реализуйте тест")
    }

    // TODO: [Задание 10] Проверьте, что remove возвращает false
    //   при несуществующем id.
    @Test
    fun `remove returns false for unknown id`() {
        TODO("Реализуйте тест")
    }
}
