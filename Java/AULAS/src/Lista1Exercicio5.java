/*
 * programa
{
	//Exerc�cio 5: "Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2, 3, e 5, respectivamente.
	funcao inicio()
	{
		real n1
		real n2
		real n3
		real mp

		escreva("Insira a Nota 1: ")
		leia(n1)
		escreva("Insira a Nota 2: ")
		leia(n2)
		escreva("Insira a Nota 3: ")
		leia(n3)

		mp = ((n1*2)+(n2*3)+(n3*5)/10)
		escreva("Sua m�dia �: "+mp)
	
	}
}
 */
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
		System.out.println("Sua m�dia �: "+mp);
		
		}
	
}
