package introducao;

import java.util.*;
public class TesteEnquanto {

	public static void main(String[] args) {
		
		//precisa do nome e do sal�rio
		//precisa informar o nome e o sal�rio da pessoa que tem o maior sal�rio
		//o programa termina quando for digitado um valor negativo ou zero
		
		
		//processamentos
		//sa�das
		
		//vari�veis
		Scanner leia = new Scanner(System.in); //instanciou teclado
		String nome=""; //instanciou o nome
		double salario=0.00; //criou o sal�rio
		double maiorSalario=0.00; //criou o maior sal�rio
		String nomeMaiorSalario="";
		
		//entradas
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite seu sal�rio: R$");
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
			System.out.println("Digite seu sal�rio: R$");
			salario = leia.nextDouble();
		}
		System.out.println();
		System.out.printf("O maior sal�rio � R$ %f, da pessoa %s",maiorSalario,nomeMaiorSalario);
	}

}
