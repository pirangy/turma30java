/*
 * Informar todos os números de 1000 a 1999 que 
 * quando divididos por 11 obtemos resto = 5. (FOR)
 */

package listas.Lista3;

import java.util.*;

public class Lista3Exercicio1 
	{

		public static void main(String[] args) 
		{
			int numero;
			
			for (numero=1000;numero<=1999;numero++) //para os números entre 1000 e até 1999...
			{
				if (numero%11==5) //... e, se quando dividirmos esses números por 11, obtivermos 5 de resto...
				
					System.out.printf("\n %d",numero); //imprima estes numeros.
				
			}
			
		}

	}
