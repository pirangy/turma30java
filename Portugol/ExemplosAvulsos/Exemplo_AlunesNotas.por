programa
{
	
	funcao inicio()
	{
		//nome alune - alunes[4]
		//nome alune - notas [4]
		
		cadeia alunes[4]
		real notas[4]

		para(inteiro indice=0;indice<4;indice++){
		escreva("digite o nome: ")
		leia(alunes[indice])
		escreva("digite a nota: ")
		leia(notas[indice])
		}
		
		para(inteiro indice=0; indice<4; indice++){
			se(notas[indice]<5){
				escreva("\nNome: ", alunes[indice]," - Nota: ", notas[indice],"Estude mais!")
			} senao {
				escreva("\nNome: ", alunes[indice]," - Nota: ", notas[indice], " - Muito bem! Continue assim!")
			}
		}
		
		//mostra depois NOME - NOTA
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {alunes, 9, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */