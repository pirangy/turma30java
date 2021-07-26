programa
{
	
	funcao inicio()
	{
		//variaveis - fortemente tipada (obrigado a declarar o tipo de variável, ou seja, linguagem formal) ou fracamente tipada 
		cadeia nome
		inteiro anoNascimento //camelCase PascalCase
		inteiro idade
		const inteiro ANOATUAL = 2021
		caracter vocativo
		

		escreva("Digite o nome: ")
		leia(nome)
		escreva("Digite como prefere ser identificade (O/A/E): ")
		leia(vocativo)
		escreva("Digite o ano de nascimento: ")
		leia(anoNascimento)

		idade = ANOATUAL - anoNascimento

		//Se acima ou igual a 45 anos: Cringe
		// SE for abaixo de 16: Infanto-Juvenil

		se (idade>=30){
			se(vocativo == 'O'){
				escreva("Oi, Sr "+nome+", sua idade é "+idade+" anos e você é cringe. Sinto muito.")
			}
			senao se(vocativo == 'o'){
				escreva("Oi, Sr "+nome+", sua idade é "+idade+" anos e você é cringe. Sinto muito.")
			}
			se(vocativo == 'A'){
			escreva("Oi, Sra"+nome+", sua idade é "+idade+" anos e você é cringe. Sinto muito.")
			}
			escreva("\nFIM DE PROGRAMA")
		}

		senao se (idade<=16){
			escreva("Oi, "+nome+", sua idade é "+idade+" anos e você é infanto-juvenil. Sucesso!!")
			escreva("\nFIM DE PROGRAMA")	 
		}
		senao se(idade<18){
			escreva("Oi, "+nome+", sua idade é "+idade+" anos e você é adolescente. Parabéns!!")
			escreva("\nFIM DE PROGRAMA")	 
		}

		senao {
			escreva("Oi, "+nome+", sua idade é "+idade+" anos e você não é cringe. Parabéns!!")
			escreva("\nFIM DE PROGRAMA")	 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1010; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {idade, 9, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */