programa
{
	/*Exercício 5: 
	"A Secretaria de Meio Ambiente que controla o índice de poluição
	mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente.
	O índice de poluição aceitável varia de 0.05 até 0.25. Se o índice sobre para
	0.3, as indústrias do 1ª grupo são intimadas a suspenderem suas atividades,
	se o índice crescer para 0.4, as indústrias do 1ª e 2ª grupo são
	intimidas a suspenderem suas atividades, se o índice atingir 0.5, todos os grupos
	devem ser notificados a paralisarem suas atividades.
	Faça um sistema que leia o índice de poluição medido e emita a notificação
	adequada aos diferentes grupos de empresas."
	*/	
	funcao inicio()
	{
		real p  //índice de poluição
		
		escreva("Digite o índice de poluição: ")
		leia(p)


		se (p<=0.25){
			escreva("Nível de poluição aceitável.")
		}
		
		se (p>0.25){
			escreva("Nível de poluição alarmante.")
		}

		se (p==0.3){
			escreva("\nIndústria 'A' deve suspender as atividades.")
		}
		se (p>0.3 e p<0.4){
			escreva("\nIndústria 'A' deve suspender as atividades.")
		}
		se (p==0.4){
			escreva("\nIndústrias 'A' e 'B' devem suspender as atividades.")
		}
		se (p>0.4 e p<0.5){
			escreva("\nIndústrias 'A' e 'B' devem suspender as atividades.")
		}
		se (p==0.5){
			escreva("\nTodas as indústrias devem suspender as atividades.")
		}
		se (p>0.5){
			escreva("\nTodas as indústrias devem suspender as atividades e a região deve ser evacuada.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 650; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */