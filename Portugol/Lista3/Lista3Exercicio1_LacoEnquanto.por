programa
{
	/*
	1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	apresente no final o total do somatório, a média e o total de valores lidos.
	O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
	Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	*/
	funcao inicio()
	{
		real x
		real soma=0.00
		real media=0.00
		real totalValores=0.00

		escreva("Digite um valor numérico: ")
		leia(x)
		
		enquanto(x>=0){
			soma=soma+x
			totalValores=totalValores++ //incremento
			escreva("Digite um valor numérico: ")
			leia(x)
		}

		media=soma/totalValores
		escreva("\nO somatório dos valores é: ",soma)
		escreva("\nA média dos valores é: ",media)
		escreva("\nA quantidade de valores lidos foi: ",totalValores)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */