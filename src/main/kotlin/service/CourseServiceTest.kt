package service

import model.Course
import model.Module
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CourseServiceTest {

    val courseService = CourseService()
    val curso = Course("INTRO-CS-1", "Curso de Japonês", 9,
        Module("INTRO-CS-1", "Curso de Japonês", "Curso introdutório de Japonês")
    )

    @Test
    fun registerCourse() {
        courseService.registerCourse(curso)
        assertEquals(true, courseService.verifica("INTRO-CS-1"))
    }
}