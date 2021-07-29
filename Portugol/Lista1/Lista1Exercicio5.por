programa
{
	//Exercício 5: "Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	//aluno. Considerar que a média é ponderada e que o peso das notas é: 2, 3, e 5, respectivamente.
	funcao inicio()
	{
		real n1
		real n2
		real n3
		real mp

		escreva("Insira a Nota 1: ")
		leia(n1)
		escreva("Insira a Nota 2: ")
		leia(n2)
		escreva("Insira a Nota 3: ")
		leia(n3)

		mp = ((n1*2)+(n2*3)+(n3*5)/10)
		escreva("Sua média é: "+mp)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */