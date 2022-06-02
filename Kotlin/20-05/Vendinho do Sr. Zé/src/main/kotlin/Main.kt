fun main() {

    /*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:
    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.*/


    var num: Int
    val estoque = mutableListOf<String>("Caneta", "Papel", "Borracha")

    do {
        println("Bem vindo ao estoque, Digite uma opção para continuar: " +
                "\n1- Adicionar produto " +
                "\n2- Excluir produto " +
                "\n3- Atualizar produto " +
                "\n4- Ver a lista de produtos" +
                "\n0 - Sair")
        num = readln().toInt()

        when (num) {
            0 -> {
                println("Programa finalizado!")
            }
            1 -> if (num == 1) {
                println("Digite qual produto sera inserido no estoque: ")
                val valor = readln()
                estoque.add(valor)

                println("Produto adicionado ao estoque com sucesso.")
            }
            2 -> if (num == 2) {
                while (true) {
                    println("Digite um nome para você deletar da lista: ")
                    val valor = readln()

                    if (estoque.contains(valor)) {
                        estoque.remove(valor)
                        break
                    } else {
                        println("O nome $valor não existe na lista")
                    }
                }

            }
            3 -> if (num == 3) {
                println("Digite agora um valor que você queira editar: ")
                val edit = readln()

                if (estoque.contains(edit)) {
                    val index = estoque.indexOf(edit)
                    println("Digite o novo nome: ")
                    val valor = readln()
                    estoque[index] = valor
                    println("O nome foi atualizado com sucesso!")
                } else {
                    println("O nome $edit não existe na lista")
                }
            }
            4 -> if (num == 4) {
                println("O tamanho da lista é: ${estoque.size}")
                println(estoque)
            }


        }

    } while(num != 0)


}