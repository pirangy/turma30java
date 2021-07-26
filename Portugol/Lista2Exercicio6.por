programa
{
	/*Exercício 6: 
	"Elabore um sistema que dada a idade de um nadador classifique-o em uma das
	seguintes categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adulto = Maiores de 18 anos"
	*/	
	funcao inicio()
	{
		inteiro idade
		inteiro A

		escreva("Olá, atleta de natação! Digite sua idade: ")
		leia(idade)

		se (idade<5){
			escreva("Poxa, infelizmente você ainda não está pronto para competir. Aguarde sua hora!")
		}

		se (idade>=5 e idade<=7){
			escreva("Atleta, sua categoria é Infantil A.")
		}

		se (idade>=8 e idade<=11){
			escreva("Atleta, sua categoria é Infantil B.")
		}
		
		se (idade>=12 e idade<=13){
			escreva("Atleta, sua categoria é Juvenil A.")
		}
		
		se (idade>=14 e idade<=17){
			escreva("Atleta, sua categoria é Juvenil B.")
		}

		se (idade>=18){
			escreva("Atleta, sua categoria é Adulto.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */