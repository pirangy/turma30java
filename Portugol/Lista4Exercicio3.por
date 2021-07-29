programa
{
	/*
	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	
	*/
	funcao inicio()
	{
		const inteiro L=4, C=6
		inteiro n1 [L][C], n2 [L][C], l, c, m1[L][C], m2[L][C]

		para(l = 0; l<L; l++)
		{
			para(c = 0; c<C; c++)
			escreva("Digite o valor da matriz 1 [", l, "] [",c,"]:")
			leia(n1[l][c])
		}

		para(l = 0; l<L; l++)
		{
			para(c = 0; c<C; c++)
			escreva("Digite o valor da matriz 2 [", l, "] [",c,"]:")
			leia(n2[l][c])
		}
		
		para(l=0;l<L;l++)
		{
			para(c=0;c<C;c++)
			{
				m1[L][C]= n1[L][C] + n2[L][C]
				m2[L][C]= n1[L][C] - n2[L][C]
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */