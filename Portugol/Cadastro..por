programa {
	funcao inicio() {
		cadeia nome
		inteiro idade
		real altura
		cadeia pratoPreferido
		
		
		escreva("Bem vindo ao sistema de Cadastro digital !! \n",
		"\nPor favor Digite seu nome: ")
		leia(nome)

		escreva("\nMuito prazer ", nome," \nAgora preciso que me diga a sua idade: ")
		leia(idade)

		escreva("\nLegal, então você tem ",idade," Anos !! \n",
		"\n",nome," Agora eu vou precisar que você me diga a sua altura: " )
		leia(altura)

		escreva("\nEstamos quase lá !!!!\n",
		"\nAgora preciso me diga, Qual seu prato preferido ? ")
		leia(pratoPreferido)
		
		escreva("\n***Cadastro Realizado com Sucesso*** " ,nome)

		escreva("\n\nSeu nome é: ",nome,"\nVocê tem: ",idade," Anos \n",
		"Você tem: ",altura," de altura\n","Seu prato preferido é: ",pratoPreferido)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */