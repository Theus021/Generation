programa
{
	
	funcao inicio()
	{
		//Variavel
		real peso, excesso=0.0, multa=0.0

		//Pegar informação
		escreva("Escreva o peso: ")
		leia(peso)
		
		//Passando os dados
			se(peso > 50){
				excesso = peso - 50
				multa = excesso * 4.0
				 
			}
				 escreva("\nExcesso: ",excesso, "\n")
				 escreva("Multa: R$", multa)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */