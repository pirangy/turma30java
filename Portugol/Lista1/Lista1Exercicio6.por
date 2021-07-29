programa
{
	
	//Exercício 6: "Construa um programa que, tendo como dados de entrada dois pontos quaisquer
	//no plano, P(x1, y1) e P(x2,y2), escreva a distância entre eles."
	
	//Atenção aos detalhes: Incluir Biblioteca Matemática para executar raiz quadrada e não misturar a sintaxe da Biblioteca com "código escrito à mão". 

	inclua biblioteca Matematica --> Mat
	funcao inicio(){
		

		real x1
		real x2
		real y1
		real y2
		real d
		real p1
		real p2


		escreva("Digite o valor x1: ")
		leia(x1)
		escreva("Digite o valor x2: ")
		leia(x2)
		escreva("Digite o valor y1: ")
		leia(y1)
		escreva("Digite o valor y2: ")
		leia(y2)

		p1 = Mat.potencia((x2-x1), 2)
		p2 = Mat.potencia((y2-y1), 2)
		d = Mat.raiz((p1+p2), 2)

		escreva("\nO A distância é: "+d)
	}

	//Possibilidades: procurar meios de tornar o código mais sucinto.
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */