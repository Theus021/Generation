fun main(args: Array<String>) {
    print("Digite sua idade e veja em qual categoria você se encaixa: ")
    var idade = readLine()!!.toInt()

        when(idade){
            in 10..14 -> println("Sua categoria é INFANTIL")
            in 15..17 -> println("Sua categoria é JUVENIL")
            in 18..25 -> println("Sua categoria é ADULTO")
        else ->{
        println("Categoria não identificada")
        println("Digite numeros entre 10 e 25")
    }
}
1}