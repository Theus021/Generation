fun main(
    var nome: String, var telefone: String) {

    var email = ""
    var aniversario = ""
    var descontoVip = false

    constructor(nome: String, telefone: String, email: String, aniversario: String)
            :this(nome, telefone){
        this.email = email
        this.aniversario = aniversario
    }

    fun compra() {
        println("Escolha o produto abaixo e informe a quantidade:"+
                "\n1 - Suco Natural   2 - Vitamina   3 - Smoothie")
    }
    fun pagamento(valor:Int) {
        println("A sua compra deu R$$valor"+
                "\nEscolha uma forma de pagamento:"+
                "\n1 - Dinheiro   2 - Débito   3 - Crédito")
    }
}
package classe

class Conta(
    var titular: String, var cpf: String, var agencia: Int, var conta: Int, var saldo: Double){

    var emprestimo = false

    constructor(titular: String, cpf: String, agencia: Int, conta: Int, saldo: Double, emprestimo: Boolean)
            :this(titular, cpf, agencia, conta, saldo){
        this.emprestimo = emprestimo
    }

    fun saldo(){
        println(" O saldo da sua conta é de R$$saldo. ")
    }
    fun saque(valor: Double){
        if (valor > 0 && valor <= saldo){
            saldo -= valor
            println("Saque: R$$valor"+
                    "\n Saldo: R$$saldo")
        }else{
            println("Valor disponível para saque: R$$saldo")
            println("Tente novamente mais tarde.")
        }
    }
    fun deposito(valor: Double){
        if (valor > 0){
            saldo += valor
            println("Depósito: R$$valor"+
                    "\n Saldo: R$$saldo")
        }else{
            println("Não é possível depositar esse valor.")
            println("Tente novamente mais tarde.")
        }
    }
    fun transferir(valor: Double){

        if (valor > 0 && valor <= saldo){
            saldo -= valor
            println("Transferência: R$$valor"+
                    "\n Saldo: R$$saldo")

        }else{
            println("Valor disponível para transferência: R$$saldo")
            println("Tente novamente mais tarde.")
        }
    }
}