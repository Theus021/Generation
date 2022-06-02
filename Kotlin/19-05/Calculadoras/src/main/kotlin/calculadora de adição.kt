fun main(){

    println("--Calculadora de Soma--")

    print("Digite um numero: ")
        val num1 = readln().toInt()

    print("Digite um numero: ")
        val num2 = readln().toInt()

    println("O resuldado da soma é: ${soma(num1, num2)}")
}

fun soma(n1: Int, n2: Int): Int {
    return n1 + n2
}