programa
{
	
	funcao inicio()
	{
		inteiro numero = 0
		inteiro total = 0
		cadeia senha = "123"
		inteiro contador=0

		faca {

		contador++ //contador = contador+1
		se (contador>=1){
				escreva("Digite a senha: ")
				leia(senha)
				
			} senao se (contador==2){
				escreva("Você só tem mais essa chance.")
				escreva("\nDigite a senha novamente.")
				leia(senha)	
			} 
			
			senao {
				escreva("Sistema bloqueado. Invasão.")
			}

			enquanto (senha !="123")
		}

	
		escreva("Seguindo o programa...")
		
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */