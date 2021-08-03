package emGrupo;

import java.util.*;
import java.math.*;
public class Exercicio_IR {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double salario;
		String nome;
		String pronome;
		int id; //ele, ela, ellu
		
		System.out.println("Digite o nome: ");
		nome = leia.nextLine();
		
		System.out.println("Como podemos te chamar? [1-Ele] [2-Ela] [3-Ellu]");
		id = leia.nextInt();
		
		if(id == 1)
			{
				pronome = "Sr.";
				System.out.println("Olá, Sr. "+nome);
			}
		else if(id == 2)
			{
				pronome = "Sra.";
				System.out.println("Olá, Sra. "+nome);
			}
		else if (id == 3)
			{
				pronome = "Sre.";
				System.out.println("Olá, Sre. "+nome);
			}
		
		System.out.println("Por favor, digite seu salário bruto: R$ ");
		salario = leia.nextDouble();			
		
		if (salario<=2000) 
		{
			System.out.printf("%s, seu salário está isento do imposto de renda.",nome);
		}  
		else if (salario>2000 && salario<=5000)
		{
			double imp15 = salario*0.15;
			System.out.printf("Seu IR é: ",imp15);
				
		} 
		else (salario>5000) 
		{
				
			double imp25 = salario*0.25;
			System.out.printf("Seu IR é: ",imp25);
				
		}
			
	
	}

}
