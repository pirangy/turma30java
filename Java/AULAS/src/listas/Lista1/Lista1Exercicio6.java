package listas.Lista1;

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
		
		d=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y1-y2),2))); //modo direto, raiz quadrada9
		
		System.out.println("A distância é: "+d);
		
	}

}
