programa
{
	//Exercício 4: "Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: "
	//Atenção aos detalhes: Pedir que usuário insira os valores e discriminar as operações matemáticas que devem ser realizadas
	
	funcao inicio(){

		inteiro A
		inteiro B
		inteiro C
		inteiro R
		inteiro S
		inteiro D
	
		escreva("Digite o valor A: ")
		leia(A)
		escreva("Digite o valor B: ")
		leia(B)
		escreva("Digite o valor C: ")
		leia(C)
		
		R = (A+B)^2
		S = (B+C)^2
		D = (R+S)/2	
		escreva("O resultado final é: "+D)
	}

	//Possibilidades: procurar meios de tornar o código mais sucinto.
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */