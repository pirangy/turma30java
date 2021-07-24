programa
{
	/*Exercício 8: 
	"O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e
	dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e
	os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e 
	escreva o custo ao consumidor."
	*/
	
	//Atenção aos detalhes: Pedir que usuário insira os valores e discriminar as operações matemáticas que devem ser realizadas
	
	funcao inicio(){
	//Legenda: custoFb ("Custo de Fábrica"), dist ("Custo de Distribuição"), imp ("Impostos"), custoCn("Custo ao Consumidor")
	
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
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */