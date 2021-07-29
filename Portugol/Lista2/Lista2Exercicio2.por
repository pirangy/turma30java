programa
{
	/*Exercício 2: 
	"Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
	E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
	A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente."
	*/
	
	funcao inicio()
	{
		inteiro C //código
		inteiro N //número de horas
		const inteiro HORA = 10 //valor da hora
		inteiro E //excesso de horas
		const inteiro EXCESSO = 20  //valor da hora extra
		const inteiro JORNADA = 50 //horas da jornada
		const inteiro BASE = 500 //salario base
		inteiro salarioTotal
		inteiro salarioExcedente

		escreva("Digite seu código: ")
		leia(C)
		escreva("Digite quantas horas você trabalhou: ")
		leia(N)
		limpa()

		E= N-JORNADA
		salarioExcedente= E*EXCESSO
		salarioTotal= BASE+salarioExcedente
		

		se (E==0) {
			escreva("Horas excedentes: 0")
			escreva("\nSeu salário é "+salarioTotal)
			
		}
		se (E>0) {
			escreva("Seu salário total é "+salarioTotal+" e seu salário excedente é "+salarioExcedente) 
		}	

		se (N<50.00) {
			escreva("Horas excedentes: 0")
			escreva("\nSeu salário total é "+N*HORA)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */