package listas.Lista2;

import java.util.*;
import java.math.*;
public class exercicio4 {

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner(System.in);
		double n;
		
		System.out.println("Digite o valor númerico: ");
		n = leia.nextDouble();
		
		if(n<0)
		{
			System.out.println("O número é negativo. Reinicie o programa.");
		}
		else if (n==0) 
		{
			System.out.println("Número 0 é neutro. Reinicie o programa.");
		}
		
		else if(n%2==0) 
		{
			System.out.println("O número é par. A raiz quadrada é: "+Math.sqrt(n)+".");
		} else 
				{
				
					System.out.println("O número é ímpar. O quadrado do número é: "+n*n+".");
			
				}
		
	}

}
