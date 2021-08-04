package listas.Lista1;

import java.util.Scanner;
public class Lista1Exercicio1 {

	public static void main (String [] args)
		{
			
			Scanner leia = new Scanner(System.in);
			int anos;
			int meses;
			int dias;
			int totalDias;
			
			System.out.println("Digite quantos anos você tem: ");
			anos = leia.nextInt();
			System.out.println("Digite quantos meses: ");
			meses = leia.nextInt();
			System.out.println("Agora, digite quantos dias: ");
			dias = leia.nextInt();
			
			totalDias = (anos*365)+(meses*30)+dias;
			System.out.println("Sua idade em dias é: "+totalDias+" dias.");
		
		}
	
}
