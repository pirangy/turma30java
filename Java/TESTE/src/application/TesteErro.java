package application;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor;
		int valores[] = new int[4]; //vetor com �ndice de 0-3
		
		/*
		try {
			
		} catch (erro) {
			
		}*/
		
		try {
		System.out.println("Digite a posi��o dentro do vetor 0-3: ");
		valor = leia.nextInt();
		System.out.println("Digite um valor inteiro: ");
		valores[valor] = leia.nextInt();
		
		System.out.printf("O valor digitado na posi��o %d foi %d.\n",valor,valores[valor]);
		
		System.out.println("O valor da divis�o teste �: "+valores[valor]/valor);
		
		
		} catch (Exception erro) {
			System.out.println("Voc� errou!");
		}
		System.out.println("Fim de programa.");	
		
		/*catch (java.lang.ArithmeticException erro) {
			System.out.println("Imposs�vel dividir por zero! Fui banda mel!");
		} 
		catch (java.util.InputMismatchException erro) {
			System.out.println("Digite um n�mero inteiro, por favor!");
		}
		catch(java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("O tamanho do vetor � de 0 a 3. Digite direito!");
		}
		
		*/
		
	}

}
