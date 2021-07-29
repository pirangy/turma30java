programa
{
	/*Exercício 3: 
	" Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
."
	*/
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a
		inteiro b
		inteiro c
		inteiro d
		inteiro a2
		inteiro b2
		inteiro c2
		inteiro d2

		escreva("Digite o primeiro número: ")
		leia(a)
		escreva("Digite o segundo número: ")
		leia(b)
		escreva("Digite o terceiro número: ")
		leia(c)
		escreva("Digite o quarto número: ")
		leia(d)
		limpa()

		a2 = mat.potencia(a, 2)
		b2 = mat.potencia(b, 2)
		c2 = mat.potencia(c, 2)
		d2 = mat.potencia(d, 2)

		se (c2>=1000){
			escreva(c2)
		}

		senao {
			escreva("O quadrado do primeiro número é: "+a2+"\nO quadrado do segundo número é: "+b2+"\nO quadrado do teceiro número é: "+c2+"\nO quadrado do quarto número é: "+d2)
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */