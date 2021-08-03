/*
 * programa
{
	//Exercício 7: "Um sistema de equações lineares do tipo: (...). Escreva um sistema que
	//lê os coeficientes a, b, c, d, e e f, calcula e mostra os valores de x e y.

	funcao inicio()
	{
		real A
		real B
		real C
		real D
		real E
		real F
		real x
		real y

		escreva("Informe o valor de A: ")
		leia(A)
		escreva("Informe o valor de B: ")
		leia(B)
		escreva("Informe o valor de C: ")
		leia(C)
		escreva("Informe o valor de D: ")
		leia(D)
		escreva("Informe o valor de E: ")
		leia(E)
		escreva("Informe o valor de F: ")
		leia(F)

		x = (C*E-B*F)/(A*E-B*D)
		y = (A*F-C*D)/(A*E-B*D)

		escreva("O valor de X é "+x+" e o valor de Y é "+y)
	
	}
}
 */
import java.util.Scanner;
public class Lista1Exercicio7 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		double A;
		double B;
		double C;
		double D;
		double E;
		double F;
		double x;
		double y;
		
		System.out.println("Informe o valor de A: ");
		A = leia.nextDouble();
		System.out.println("Informe o valor de B: ");
		B = leia.nextDouble();
		System.out.println("Informe o valor de C: ");
		C = leia.nextDouble();
		System.out.println("Informe o valor de D: ");
		D = leia.nextDouble();
		System.out.println("Informe o valor de E: ");
		E = leia.nextDouble();
		System.out.println("Informe o valor de F: ");
		F = leia.nextDouble();
		
		x=(C*E-B*F)/(A*E-B*D);
		y=(A*F-C*D)/(A*E-B*D);
		
		System.out.println("O valor de X é "+x+" e o valor de Y é "+y);

		
		
	}

}
