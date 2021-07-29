programa
{
	/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que 
		se encontram no conjunto dos números de 1 até 500.*/
	funcao inicio()
	{	
		inteiro x
		inteiro somaImparMultiplo3 = 0

		para(x=1;x<=500;x++){
			se(x%2!=0 e x%3==0){
				somaImparMultiplo3 = somaImparMultiplo3+x
			}
		}

		escreva("A soma de todos os números ímpares múltiplos de três entre 100 e 500 é: ",somaImparMultiplo3)
	}
		
}		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */