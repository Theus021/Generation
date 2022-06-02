fun main() {

    //Entrada de dados
    println("Digite um numero inteiro")
    var num1 = readln().toInt()

    println("Digite um numero inteiro")
    var num2 = readln().toInt()

    println("Digite um numero inteiro")
    var num3 = readln().toInt()

    var total: Int

    if (num1 > num2 && num1 > num3){
        total = num1
    }else if (num2 > num3){
        total = num2
    }else{
        total = num3
    }
    println("O numero maior é o $total")
}