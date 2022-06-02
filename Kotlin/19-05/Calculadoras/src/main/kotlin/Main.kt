fun main(args: Array<String>) {

    println("--Calculadora de Divisão--")

    print("Digite um numero: ")
    val num1 = readln().toInt()

    print("Digite um numero: ")
    val num2 = readln().toInt()

    println("A Divisão dos números é: ${divi(num1, num2)}")

}
fun divi(x1: Int, x2: Int): Int {
    return x1 / x2
}