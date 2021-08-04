/*
 * programa
{
	//Exercício 2: "Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias."
	//Atenção aos detalhes: Considerar os dias restantes na divisão, declarar variável para eles
	
	funcao inicio(){

		inteiro totalDias
		inteiro anos
		inteiro meses
		inteiro diasRestantes
		inteiro dias
	
		escreva("Digite quantos dias você tem: ")
		leia(totalDias)
	
		anos = totalDias/365
		diasRestantes = totalDias%365
		meses = diasRestantes/30
		dias = diasRestantes%30
		
		escreva("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias.")
	}
}
 */

import java.util.Scanner;
public class Lista1Exercicio2 {
	
		public static void main(String [] args) {
		
			Scanner leia = new Scanner(System.in);
			int totalDias;
			int anos;
			int meses;
			int diasRestantes;
			int dias;
			
			System.out.println("Digite quantos dias você tem: ");
			totalDias = leia.nextInt();
			
			anos = totalDias/365;
			diasRestantes = totalDias%365;
			meses = diasRestantes/30;
			dias = diasRestantes%30;
			
			System.out.println("Você tem "+anos+" anos, "+meses+" meses e "+dias+" dias. ");
		
		}

	
}
