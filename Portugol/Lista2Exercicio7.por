programa
{
	/*Exercício 7: 
	"Receber valores de base e altura de um triângulo e verificar se são
	valores válidos (positivos maiores que zero). Em caso afirmativo, calcular
	a área do triângulo."
	*/		
	funcao inicio()
	{
		inteiro base
		inteiro altura
		inteiro area

		escreva("Informe o valor de base do seu triângulo: ")
		leia(base)
		escreva("Informe o valor de altura do seu triângulo: ")
		leia(altura)

		area=base*altura

		se(base<=0 e altura<=0){
			escreva("Valores inválidos (negativos e menores que 0)")
		}
		senao {
			escreva("A área do seu triângulo é: ",area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */