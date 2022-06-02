programa
{
	
	funcao inicio()
	{
		real peso, altura, resultado

	escreva("Qual é o seu peso ")
	leia(peso)
	escreva("Qual é a sua altura ") 
	leia(altura)
	resultado =peso/(altura*altura)
	

	se (resultado <=18.4){
		escreva("\nseu IMC é: ABAIXO DO NORMAL")
		}
		senao se (resultado <=24.9){
			escreva("\nSeu IMC é: NORMAL" , resultado)
			}
		senao se(resultado <=29.9){
				escreva("\nSeu IMC é: SOBRE PESO")
				}
		senao se(resultado <=39.9){
				escreva("\nSeu IMC é: OBESIDADE")
				}
				senao {
				escreva("\nSeu IMC é: OBESIDADE GRAVE")
				}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */