package application;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor;
		int valores[] = new int[4]; //vetor com índice de 0-3
		
		/*
		try {
			
		} catch (erro) {
			
		}*/
		
		try {
		System.out.println("Digite a posição dentro do vetor 0-3: ");
		valor = leia.nextInt();
		System.out.println("Digite um valor inteiro: ");
		valores[valor] = leia.nextInt();
		
		System.out.printf("O valor digitado na posição %d foi %d.\n",valor,valores[valor]);
		
		System.out.println("O valor da divisão teste é: "+valores[valor]/valor);
		
		
		} catch (Exception erro) {
			System.out.println("Você errou!");
		}
		System.out.println("Fim de programa.");	
		
		/*catch (java.lang.ArithmeticException erro) {
			System.out.println("Impossível dividir por zero! Fui banda mel!");
		} 
		catch (java.util.InputMismatchException erro) {
			System.out.println("Digite um número inteiro, por favor!");
		}
		catch(java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("O tamanho do vetor é de 0 a 3. Digite direito!");
		}
		
		*/
		
	}

}
