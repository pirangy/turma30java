programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro jogadas[5]

		para(inteiro x=0;x<5;x++){
			jogadas[x] = Util.sorteia(1, 6)
		}
		escreva("Mostrando os valores!\n")
		para(inteiro x=0;x<5;x++){
			escreva("lançamento ",x+1," - ",jogadas[x],"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {jogadas, 7, 10, 7}-{x, 13, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */