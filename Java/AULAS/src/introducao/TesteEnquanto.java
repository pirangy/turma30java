package introducao;

import java.util.*;
public class TesteEnquanto {

	public static void main(String[] args) {
		
		//precisa do nome e do salário
		//precisa informar o nome e o salário da pessoa que tem o maior salário
		//o programa termina quando for digitado um valor negativo ou zero
		
		
		//processamentos
		//saídas
		
		//variáveis
		Scanner leia = new Scanner(System.in); //instanciou teclado
		String nome=""; //instanciou o nome
		double salario=0.00; //criou o salário
		double maiorSalario=0.00; //criou o maior salário
		String nomeMaiorSalario="";
		
		//entradas
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite seu salário: R$");
		salario = leia.nextDouble();
		while (salario>0) 
		{
			if (salario>maiorSalario)
			{
				maiorSalario=salario;
				nomeMaiorSalario=nome;
			}
			System.out.println("Digite seu nome: ");
			nome = leia.next();
			System.out.println("Digite seu salário: R$");
			salario = leia.nextDouble();
		}
		System.out.println();
		System.out.printf("O maior salário é R$ %f, da pessoa %s",maiorSalario,nomeMaiorSalario);
	}

}
