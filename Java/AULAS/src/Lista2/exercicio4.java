/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package Lista2;

import java.util.*;
import java.math.*;
public class exercicio4 {

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner(System.in);
		double n;
		
		System.out.println("Digite o valor n�merico: ");
		n = leia.nextDouble();
		
		if(n<0)
		{
			System.out.println("O n�mero � negativo. Reinicie o programa.");
		}
		else if (n==0) 
		{
			System.out.println("N�mero 0 � neutro. Reinicie o programa.");
		}
		
		else if(n%2==0) 
		{
			System.out.println("O n�mero � par. A raiz quadrada �: "+Math.sqrt(n)+".");
		} else 
				{
				
					System.out.println("O n�mero � �mpar. O quadrado do n�mero �: "+n*n+".");
			
				}
		
	}

}
