/*
 * Informar todos os n�meros de 1000 a 1999 que 
 * quando divididos por 11 obtemos resto = 5. (FOR)
 */

package listas.Lista3;

import java.util.*;

public class Lista3Exercicio1 
	{

		public static void main(String[] args) 
		{
			int x, soma=0;
			
			for (x=1000;x<=1999;x++)
			{
				if (x%11==5)
				System.out.printf("\n %d",x);
				
			}
			
			//System.out.printf("\nSoma total: %d",soma);
		}

	}
