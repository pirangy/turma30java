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
			int numero;
			
			for (numero=1000;numero<=1999;numero++) //para os n�meros entre 1000 e at� 1999...
			{
				if (numero%11==5) //... e, se quando dividirmos esses n�meros por 11, obtivermos 5 de resto...
				
					System.out.printf("\n %d",numero); //imprima estes numeros.
				
			}
			
		}

	}
