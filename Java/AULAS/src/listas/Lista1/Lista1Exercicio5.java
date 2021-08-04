package listas.Lista1;

import java.util.Scanner;
public class Lista1Exercicio5 {
	
		public static void main (String[]args) 
		{
		Scanner leia = new Scanner (System.in);
		double n1;
		double n2;
		double n3;
		double mp;
		
		System.out.println("Insira a Nota 1: ");
		n1 = leia.nextDouble();
		System.out.println("Insira a Nota 2: ");
		n2 = leia.nextDouble();
		System.out.println("Insira a Nota 3: ");
		n3 = leia.nextDouble();
		
		mp = ((n1*2)+(n2*3)+(n3*5)/10);
		System.out.println("Sua média é: "+mp);
		
		}
	
}
