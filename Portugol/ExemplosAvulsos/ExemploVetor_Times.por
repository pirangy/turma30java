programa
{
	
	funcao inicio()
	{

		cadeia times[3]
		inteiro pontos[] = {10,20,15}
		
		times[0] = "PALMEIRAS"
		times[1] = "SPFC"
		times[2] = "CORINTHIANS"
		
		//varrer o vetor
		escreva("NOME DOS TIMES \n")
		para(inteiro indice=0; indice<3; indice++){
			escreva(times[indice]," ",pontos[indice],"\n")
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */