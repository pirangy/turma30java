programa
{
	/* Exercício - Vetores [] e Matrizes [][]
	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente.
	*/
	
	funcao inicio()
	{
		const inteiro TOTAL_PONTUACOES = 5
		inteiro pontuacao, vetor[TOTAL_PONTUACOES], i, maiorPontuacao = 0
		
		para(i=0;i<5;i++){
			escreva("Digite a pontuação: ")
			leia(vetor[i])
			se(vetor[i]>maiorPontuacao)
				{
					maiorPontuacao = vetor[i]
				}
						}
		escreva("\nA maior pontuação é: ",maiorPontuacao,"\n")		
			}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */