programa
{
	
	funcao inicio(){
		
		real custoFb
		real dist
		real imp
		real custoCn

		escreva("Digite o custo de Fabrica: ")
		leia(custoFb)

		dist = (custoFb*0.28)
		imp = (custoFb*0.45)
		custoCn = (custoFb + dist + imp) 

		escreva("O custo ao consumidor é: " + custoCn)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */