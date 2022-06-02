fun main(){

    println("**Calculadora de Multiplicação**")

    print("Digite um numero: ")
    var num1 = readln().toInt()

    print("Digite um numero: ")
    var num2 = readln().toInt()

    println("O resuldado da multiplicação é: ${mult(num1, num2)}")
}

fun mult(n1: Int, n2: Int): Int{
    return n1 * n2
}