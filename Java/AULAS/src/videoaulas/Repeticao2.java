package videoaulas;

import java.util.*;

public class Repeticao2 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		while(idade>=1)
		{
			System.out.printf("Sua idade: %d", idade);
			
			if(idade>=18)
			{
				System.out.println("\nVocê é maior de idade.");
			}
			
			else
			{
				System.out.println("\nVocê é menor de idade.");
			}
			
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
		}
	}

}
