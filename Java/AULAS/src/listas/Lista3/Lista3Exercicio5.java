/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 * No final, mostre a soma dos números digitados. (DO...WHILE)
 */
package listas.Lista3;

import java.util.*;
public class Lista3Exercicio5 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in); //instanciar/criar teclado
		int numero=0, soma=0;
		
		do // faça isso:
		{
			
			//imprima esta mensagem e colete inputs de usuárie.
			System.out.println("Digite um dos algarismos do teclado do seu computador.\nEncerre com zero e descubra a soma dos números que você digitou.");
			numero = leia.nextInt();
			
			//some os números digitados por usuárie.
			soma+=numero;
		
		//enquanto estes números forem diferentes e maiores que zero, e menores que dez 
		//(ou seja: os números do teclado).
		} while(numero!=0 && numero>0 && numero <10);

		System.out.printf("A soma dos números digitados é: %d",soma); //por fim, imprima a soma dos números digitados.

	}

}
