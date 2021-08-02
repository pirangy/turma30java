programa
{
/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

Atenção ao detalhe: saber delimitar o escopo dos laços (onde se iniciam, onde terminam, quais comandos contém)
*/
	
	funcao inicio()
	{
		const inteiro HABITANTES = 3
		
		real salario = 0.00
		real mediaSalarios = 0.00
		real somaSalarios = 0.00
		real filhos = 0.00
		real mediaFilhos = 0.00
		real somaFilhos = 0.00
		real maiorSalario = 0.00
		real contadorSalarioAte100 = 0.00
		real percentualSalario100 = 0.00

		para(inteiro x=1; x<=HABITANTES; x++){
			escreva("Digite seu salário: R$")
			leia(salario)
			escreva("Digite quantos filhos você tem: ")
			leia(filhos)

			somaSalarios=somaSalarios+salario
			somaFilhos=somaFilhos+filhos

			se(salario>maiorSalario){
				maiorSalario=salario
			}

			se(salario<=100.00){
				contadorSalarioAte100++
			}//fim do laço
		}

		percentualSalario100=(contadorSalarioAte100/HABITANTES)*100
		mediaSalarios=(somaSalarios/HABITANTES)
		mediaFilhos=(somaFilhos/HABITANTES)

		escreva("\nTotal salarial: R$",somaSalarios)
		escreva("\nMédia salarial: R$",mediaSalarios)
		escreva("\nTotal de filhos: ",somaFilhos)
		escreva("\nMédia de filhos: ",mediaFilhos)
		escreva("\nMaior salario: R$",maiorSalario)
		escreva("\nPercentual até R$100.00 de salário: ", percentualSalario100)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */