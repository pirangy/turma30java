programa
{
	//Exercício 2
	//Solução: Considerar os dias restantes na divisão, declarar variável para eles
	
	funcao inicio(){

	inteiro totalDias
	inteiro anos
	inteiro meses
	inteiro diasRestantes
	inteiro dias

	escreva("Digite quantos dias você tem: ")
	leia(totalDias)

	anos = totalDias/365
	diasRestantes = totalDias%365
	meses = diasRestantes/30
	dias = diasRestantes%30
	
	escreva("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias.")
	
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */