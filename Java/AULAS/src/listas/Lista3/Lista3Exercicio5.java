/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 * No final, mostre a soma dos n�meros digitados. (DO...WHILE)
 */
package listas.Lista3;

import java.util.*;
public class Lista3Exercicio5 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in); //instanciar/criar teclado
		int numero=0, soma=0;
		
		do // fa�a isso:
		{
			
			//imprima esta mensagem e colete inputs de usu�rie.
			System.out.println("Digite um dos algarismos do teclado do seu computador.\nEncerre com zero e descubra a soma dos n�meros que voc� digitou.");
			numero = leia.nextInt();
			
			//some os n�meros digitados por usu�rie.
			soma+=numero;
		
		//enquanto estes n�meros forem diferentes e maiores que zero, e menores que dez 
		//(ou seja: os n�meros do teclado).
		} while(numero!=0 && numero>0 && numero <10);

		System.out.printf("A soma dos n�meros digitados �: %d",soma); //por fim, imprima a soma dos n�meros digitados.

	}

}
