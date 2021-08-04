package listas.Lista1;

import java.util.Scanner;
public class Lista1Exercicio4 {

	public static void main (String [] args)
		{
			Scanner leia = new Scanner(System.in);
			int A;
			int B;
			int C;
			int R;
			int S;
			int D;
			
			System.out.println("Digite o valor A: ");
			A = leia.nextInt(); 
			System.out.println("Digite o valor B: ");
			B = leia.nextInt(); 
			System.out.println("Digite o valor C: ");
			C = leia.nextInt(); 
			
			R = (A+B)^2;
			S = (B+C)^2;
			D = (R+S)^2;
			
			System.out.println("O resultado final é: "+D);
			
		}
	
}
