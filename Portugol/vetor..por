programa
{
	
 	funcao inicio()
	{ 
	/*
		cadeia nomes[5]

		para(inteiro i=0; i < 5; i++){

			escreva("Digite o nome da posição ", i, ": ") 
			leia(nomes[i])
		}

			para(inteiro i=0; i < 5; i++){
				escreva("\n",nomes[i] )
				}

*/




	inteiro num[5], menor

		para(inteiro i = 0 ; i < 5; i++){

			escreva("Digite o ", i+1, "º número: ")
			leia(num[i]) 
			
			}

			menor = num[0]
			
			para(inteiro i = 0; i < 5; i++){ 

				se(num[i] < menor )

					menor = num[i]
					
			}
		

		escreva("O menor número do vetor é: ",menor)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 24, 9, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */