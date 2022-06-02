import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {
    @Test

    fun soma() {
        assertEquals(4, Calculadora.soma(2, 2))
    }

    @Test

    fun sub() {
        assertEquals(2, Calculadora.sub(5, 3))
    }

    @Test

    fun divi() {
        assertEquals(0, Calculadora.sub(2, 2))
    }

    @Test

    fun mult() {
        assertEquals(4, Calculadora.mult(2, 2))
    }

    @Test

    fun poten() {
        assertEquals(16.0, Calculadora.poten(4.0, 2.0))
    }

    @Test
    fun raiz() {
        assertEquals(5.0,Calculadora.raiz(25.0))
    }
}

