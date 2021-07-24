programa
{
	//Exercício 1: "Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias."
	//Atenção aos detalhes: Se atentar aos valores correspondentes
	
	funcao inicio(){
	
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro totalDias
	
		escreva("Digite quantos anos você tem: ")
		leia(anos)
		escreva("Digite quantos meses: ")
		leia(meses)
		escreva("Agora, digite quantos dias: ")
		leia(dias)
		
		totalDias = (anos*365) + (meses*30) + dias
		escreva("Sua idade em dias é " +totalDias + " dias!")
	}

	//Possibilidades: comentar qual a lógica por trás das etapas.
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */