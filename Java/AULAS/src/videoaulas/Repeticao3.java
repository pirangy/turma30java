package videoaulas;

import java.util.Scanner;

public class Repeticao3 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		
		do
		{
			
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			
			System.out.printf("Sua idade: %d", idade);
			
			if(idade>=18)
			{
				System.out.println("\nVoc� � maior de idade.");
			}
			
			else if(idade<18 && idade>=1)
			{
				System.out.println("\nVoc� � menor de idade.");
			}
			
			else 
			{
				System.out.println("\nIdade inv�lida.");
			}
			
		}while(idade>=1);
		
	}
	
}
