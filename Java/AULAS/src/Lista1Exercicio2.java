/*
 * programa
{
	//Exerc�cio 2: "Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias."
	//Aten��o aos detalhes: Considerar os dias restantes na divis�o, declarar vari�vel para eles
	
	funcao inicio(){

		inteiro totalDias
		inteiro anos
		inteiro meses
		inteiro diasRestantes
		inteiro dias
	
		escreva("Digite quantos dias voc� tem: ")
		leia(totalDias)
	
		anos = totalDias/365
		diasRestantes = totalDias%365
		meses = diasRestantes/30
		dias = diasRestantes%30
		
		escreva("Voc� tem " + anos + " anos, " + meses + " meses e " + dias + " dias.")
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
			
			System.out.println("Digite quantos dias voc� tem: ");
			totalDias = leia.nextInt();
			
			anos = totalDias/365;
			diasRestantes = totalDias%365;
			meses = diasRestantes/30;
			dias = diasRestantes%30;
			
			System.out.println("Voc� tem "+anos+" anos, "+meses+" meses e "+dias+" dias. ");
		
		}

	
}
