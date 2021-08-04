package listas.Lista1;

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
