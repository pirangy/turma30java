/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

package listas.Lista2;

import java.util.*;
public class exercicio1 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
	
		if(n1>maior) //se o primeiro n�mero for maior que 0 (int maior=0)...
		{
			maior=n1; //... ent�o o primeiro n�mero � o maior.
			
			if(n2>maior)//se o segundo n�mero for maior que o maior n�mero...
				maior=n2;//... ent�o o segundo n�mero passa a ser o maior n�mero.
			
			if(n3>maior) //se o terceiro n�mero for maior que o maior n�mero...
				maior=n3;//... ent�o o terceiro n�mero passa a ser o maior n�mero.				
					 
			System.out.println("O maior n�mero �: "+maior); //imprima o maior n�mero fornecido por usu�rie.
		}
	}
}
		
	
	
