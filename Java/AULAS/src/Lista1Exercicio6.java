/*
 * programa
{
	
	//Exercício 6: "Construa um programa que, tendo como dados de entrada dois pontos quaisquer
	//no plano, P(x1, y1) e P(x2,y2), escreva a distância entre eles."
	
	//Atenção aos detalhes: Incluir Biblioteca Matemática para executar raiz quadrada e não misturar a sintaxe da Biblioteca com "código escrito à mão". 

	inclua biblioteca Matematica --> Mat
	funcao inicio(){
		

		real x1
		real x2
		real y1
		real y2
		real d
		real p1
		real p2


		escreva("Digite o valor x1: ")
		leia(x1)
		escreva("Digite o valor x2: ")
		leia(x2)
		escreva("Digite o valor y1: ")
		leia(y1)
		escreva("Digite o valor y2: ")
		leia(y2)

		p1 = Mat.potencia((x2-x1), 2)
		p2 = Mat.potencia((y2-y1), 2)
		d = Mat.raiz((p1+p2), 2)

		escreva("\nO A distância é: "+d)
	}

	//Possibilidades: procurar meios de tornar o código mais sucinto.
}
 */

import java.math.*;
import java.util.Scanner;
public class Lista1Exercicio6 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double x1;
		double x2;
		double y1;
		double y2;
		double d;
		double p1;
		double p2;

		System.out.println("Digite o valor x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor y2: ");
		y2 = leia.nextDouble();
		
		d=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y1-y2),2))); //modo direto, raiz quadrada
		
		System.out.println("A distância é: "+d);
		
	}

}
