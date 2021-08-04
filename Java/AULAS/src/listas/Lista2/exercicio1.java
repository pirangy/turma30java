/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package listas.Lista2;

import java.util.*;
public class exercicio1 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int maior = 0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
	
		if(n1>maior) 
		{
			maior=n1;
			if(n2>maior)
				maior=n2;
			
			if(n3>maior) 	
				maior=n3;				
					 
			System.out.println("O maior número é: "+maior);
		}
	}
}
		
	
	
