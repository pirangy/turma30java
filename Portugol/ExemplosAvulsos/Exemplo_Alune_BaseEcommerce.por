programa
{
	
	funcao inicio()
	{
		cadeia alune[4]
		cadeia matricula[4] //mat-1
		real nota[4] //todo mundo começa com 1 ponto

		alune[0] = "MARCOS"
		alune[1] = "MARIA"
		alune[2] = "PEDRO"
		alune[3] = "SARAH"

		cadeia auxMat
		real auxNota = 0.00

		para(inteiro x=0;x<4;x++)
			{
				matricula[x]="MAT-"+(x+1)
				nota[x]=1.00
			}

		escreva("BOLETIM ATUAL\n")
		escreva("═══════════\n")
		escreva("MAT\tNOME\t\tPONTOS ATUAIS\n")

		para(inteiro x=0;x<4;x++)
			{
				escreva(matricula[x],"\t",alune[x],"\t\t",nota[x],"\n")
			}
		
		escreva("Escolha pela matricula do alune: ")
		leia(auxMat)

		para(inteiro x=0;x<4;x++)
			{
				se(auxMat==matricula[x])
					{
						escreva(matricula[x],"\t", alune[x],"\t\t",nota[x],"\n")
						pare
						escreva("Digite a nova nota: ")
						leia(auxNota)
						nota[x]=nota[x]+auxNota
						pare
					}
				escreva("Alune selecionade: ",alune[x])	
			}

		escreva("Alune selecionade: ",alune[x])
		escreva("NOVO BOLETIM\n")
		escreva("MAT\tNOME\t\tPONTOS ATUAIS\n")

		para(inteiro x=0;x<4;x++)
			{
				escreva(matricula[x],"\t",alune[x],"\t\t",nota[x],"\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 876; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */