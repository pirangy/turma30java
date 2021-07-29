programa
{

	funcao inicio(){

		//1-1000
		// se o numero for multiplo de 3 eu pego e somo ele ao
		//total de multiplo de 3
		//faço isso até 100

		inteiro totalMultiplos4=0
		inteiro totalMultiplos7Impares=0

		para (inteiro x=1; x<=1000; x++){
			se (x>=100 e x<=200 e (x%4)==0){
				totalMultiplos4 = totalMultiplos4 + x
			}

			se (x>=400 e (x%2)==1 e (x%7)==0){
				totalMultiplos7Impares = totalMultiplos7Impares +x
			}
			 //totalizador - didático
			//total += x //totalizador - profissional	
		}
		escreva("Total múltiplos de 4 entre 100 e 200 = ",totalMultiplos4)
		escreva("\nTotal impares de 7 entre 400 e 1000 = ",totalMultiplos7Impares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */