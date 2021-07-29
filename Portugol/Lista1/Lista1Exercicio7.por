programa
{
	//Exercício 7: "Um sistema de equações lineares do tipo: (...). Escreva um sistema que
	//lê os coeficientes a, b, c, d, e e f, calcula e mostra os valores de x e y.

	funcao inicio()
	{
		real A
		real B
		real C
		real D
		real E
		real F
		real x
		real y

		escreva("Informe o valor de A: ")
		leia(A)
		escreva("Informe o valor de B: ")
		leia(B)
		escreva("Informe o valor de C: ")
		leia(C)
		escreva("Informe o valor de D: ")
		leia(D)
		escreva("Informe o valor de E: ")
		leia(E)
		escreva("Informe o valor de F: ")
		leia(F)

		x = (C*E-B*F)/(A*E-B*D)
		y = (A*F-C*D)/(A*E-B*D)

		escreva("O valor de X é "+x+" e o valor de Y é "+y)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */