/*
* 3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 *  Total de pessoas com mais de 50 anos. 
 *  O programa termina quando idade for =-99.
 */

package listas.Lista3;

import java.util.*;
public class Lista3Exercicio3 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int idade=0, menos21=0, mais50=0,totalMenos21=0,totalMais50=0;
		
		
		System.out.println("Digite a idade de uma pessoa:");
		idade = leia.nextInt();
		
		while (idade != -99)
		{
			if (idade<21)
				{
					totalMenos21++;
					totalMenos21+=menos21;				
					
				}
			
			else if (idade>50)
				{	
					totalMais50++;
					totalMais50+=mais50;
				}
			
			else 
				{
				
					
				
				}	
		
			System.out.println("Digite a idade de uma pessoa: ");
			idade = leia.nextInt();
						
		} 
		
		
		System.out.printf("O total de idades menores que 21 anos é: %d\n",totalMenos21);
		System.out.printf("O total de maiores que 50 anos é: %d\n",totalMais50);


		
	}

}
