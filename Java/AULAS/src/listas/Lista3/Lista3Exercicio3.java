/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99. (WHILE)
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
			if (idade<=21)
			{
				menos21 = idade;
				totalMenos21+=idade;
				
				if (idade>=50)
				{	
					mais50= idade;
					totalMais50+=idade;
				}
				//System.out.printf("As idades menores que 21 anos foram: %d",totalMenos21);
			}
			
			
			if(idade==-99)
			{
				
				System.out.println("Programa finalizado.");
							
			}
			
			System.out.println("Digite a idade de uma pessoa:");
			idade = leia.nextInt();
			System.out.printf("As idades menores que 21 anos foram: %d\n",totalMenos21);

		}
		
		
	}

}
