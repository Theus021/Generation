import kotlin.math.PI
import kotlin.math.pow

fun main() {

        //Entrada de dados
    print("Digite o Diametro: ")
    val diametro = readln().toDouble()

        //Process
    val raio = diametro /2
    val perimetro = 2 * PI * raio
    val area = PI * raio.pow(2.0)

        //Resultado
    println("Perimetro: ${"%.2f".format(perimetro)}")
    println("Area: ${"%.2f".format(area)}")
}