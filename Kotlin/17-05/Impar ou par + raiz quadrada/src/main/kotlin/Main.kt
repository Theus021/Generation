import java.lang.Math.sqrt
import kotlin.math.pow

fun main(args: Array<String>) {
    print("Digite um numero: ")
    val num = readln().toDouble()

    if(num % 2 ==0.0) {
        println("O numero é par e sua raiz quadrada é: ${"%.2f".format(sqrt(num))}")
        }else{
            println("O numero é impar e sua raiz quadrada é: " +
                    "%.2f".format(num.pow(2)))
        }

}