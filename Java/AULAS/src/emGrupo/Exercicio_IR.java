package emGrupo;

import java.util.*;
import java.math.*;
public class Exercicio_IR {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		double salario;
		String nome;
		String pronome;
		int id; //ele, ela, ellu
		
		System.out.println("Digite o nome: ");
		nome = leia.nextLine();
		
		//Entradas 1: como usu�ries se identificam
		System.out.println("Como podemos te chamar? [1-Ele] [2-Ela] [3-Ellu]");
		id = leia.nextInt();
		
		//Processamentos 1: como se dirigir a usu�ries
		if(id == 1)
			{
				pronome = "Sr.";
				System.out.println("Ol�, Sr. "+nome+"! Seja bem-vindo!");

			}
		else if(id == 2)
			{
				pronome = "Sra.";
				System.out.println("Ol�, Sra. "+nome+"! Seja bem-vinda!");
			}
		else if (id == 3)
			{
				pronome = "Sre.";
				System.out.println("Ol�, Sre. "+nome+"! Seja bem-vinde!");
			}
		else 
			{
			
				System.out.println("Desculpe, essa op��o n�o est� registrada. Te ajudamos a editar o cadastro depois ;)");
			
			}
		
		
		//Entradas 2: sal�rio de usu�ries
		System.out.println("Por favor, digite seu sal�rio bruto: R$ ");
		salario = leia.nextDouble();
		
		
		
		//Sa�das
		if (salario<=2000) 
			{
			
					System.out.println(nome+", seu sal�rio est� isento do imposto de renda.");
				
			}   
		else if (salario>2000 && salario<=5000) 
			{
			
				double imp15=salario*0.15;
				System.out.println(nome+", seu IR �: R$"+imp15);
				
			}	
		else
			{
				
				double imp25=salario*0.25;			
				System.out.printf(nome+", seu IR �: R$"+imp25);
				
			}
	}
}