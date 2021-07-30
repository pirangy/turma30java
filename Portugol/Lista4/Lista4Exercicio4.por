programa
{
	/*
	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
	exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	*/
	
	funcao inicio()
	{
		const inteiro L=3, C=3
		inteiro numero, matriz [L][C], soma=0, somaDiagonal=0
		
		para(inteiro l=0;l<L;l++){
				para(inteiro c=0;c<C;c++)
				{
					escreva("Digite o valor para matriz[",l,"] [",c,"] = ")
					leia(matriz[l][c])

					soma = soma+matriz[l][c]
					se(l==c)
						{
							somaDiagonal=somaDiagonal+matriz[l][c]
						}
				}
				
			}
		escreva("A soma dos elementos é: ",soma)
		escreva("\nA soma dos elementos da diagonal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 11, 18, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */