package listas.Lista1;

import java.util.Scanner;
public class Lista1Exercicio3 {

	public static void main (String [] args)
		{
			Scanner leia = new Scanner(System.in);
			int totalSegundos;
			int horas;
			int minutos;
			int segundosRestantes;
			int segundos;
			
			System.out.println("Digite quantos segundos dura o evento: ");
			totalSegundos = leia.nextInt();
			
			horas = totalSegundos/3600;
			segundosRestantes = totalSegundos%3600;
			minutos = segundosRestantes/60;
			segundos = segundosRestantes%60;
			
			System.out.println("O evento dura "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		}
	
}
