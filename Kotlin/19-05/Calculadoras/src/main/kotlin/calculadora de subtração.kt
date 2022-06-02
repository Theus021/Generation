fun main(){

    println("**Calculadora de Subtração**")

    print("Digite um numero:")
    var num1 = readln().toInt()

    print("Digite um numero: ")
    var num2 = readln().toInt()

    print("O resuldado da subtração é: ${sub(num1, num2)}")

}

fun sub(n1: Int, n2: Int): Int {
    return n1 - n2
}