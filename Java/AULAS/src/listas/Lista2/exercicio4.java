package listas.Lista2;

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
