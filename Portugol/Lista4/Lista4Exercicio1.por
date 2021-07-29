programa
{
	/* Exercício - Vetores [] e Matrizes [][]
	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente.
	*/
	
	funcao inicio()
	{
		inteiro pontuacao [5], i, maiorPontuacao = 0
		para(i=0;i<5;i++){
			escreva("Digite a pontuação: ")
			leia(pontuacao[i])
						}
		
		para(i=0;i<5;i++){
			escreva("\nSeu vetor é: ",i," - ",pontuacao[i],"\n")
				se(pontuacao[i]>maiorPontuacao){
					maiorPontuacao=pontuacao[i]
						}
					escreva("\nA maior pontuação é: ",maiorPontuacao,"\n")
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */