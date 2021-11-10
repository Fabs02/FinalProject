package service

import model.Student
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StudentServiceTest {

val studentService = StudentService()
val estudante = Student("123", "Fabricio", "fabriciotest@gmail.com", null)

    @Test
    fun subscribeStudent() {
        studentService.subscribeStudent(estudante)
        assertEquals(true, studentService.isSubscribed("123"))
    }
}