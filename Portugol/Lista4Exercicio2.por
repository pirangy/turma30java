programa
{
	/*Exercício 2 - Vetores[] e Matrizes [][]
	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
	apresente também quantas foram as ocorrências da maior pontuação.

	*/	
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro lance[10]

		para(inteiro posicaoDado=0;posicaoDado < 7;posicaoDado++)
		{
			posicaoDado[lance] = Util.sorteia(1, 5)
			escreva("\nLance: ",lance,"\nPosição do Dado: ",posicaoDado[lance])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {posicaoDado, 13, 10, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */