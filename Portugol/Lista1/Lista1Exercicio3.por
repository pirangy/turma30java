programa
{
	//Exercício 3: "Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos."
	//Atenção aos detalhes: Considerar os segundos restantes da divisão, declarar variável para eles
	
	funcao inicio(){
	
		inteiro totalSegundos
		inteiro horas
		inteiro minutos
		inteiro segundosRestantes
		inteiro segundos
	
		escreva("Digite quantos segundos dura o evento: ")
		leia(totalSegundos)
	
		horas = totalSegundos/3600
		segundosRestantes = totalSegundos%3600
		minutos = segundosRestantes/60
		segundos = segundosRestantes%60
		
		escreva("O evento dura " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */