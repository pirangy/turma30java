/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package listas.Lista2;

import java.util.*;
public class exercicio1 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
	
		if(n1>maior) //se o primeiro número for maior que 0 (int maior=0)...
		{
			maior=n1; //... então o primeiro número é o maior.
			
			if(n2>maior)//se o segundo número for maior que o maior número...
				maior=n2;//... então o segundo número passa a ser o maior número.
			
			if(n3>maior) //se o terceiro número for maior que o maior número...
				maior=n3;//... então o terceiro número passa a ser o maior número.				
					 
			System.out.println("O maior número é: "+maior); //imprima o maior número fornecido por usuárie.
		}
	}
}
		
	
	
