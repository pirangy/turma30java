package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

public class Celcius_Fahrenheit {
	
		public static void main (String[] args)
		{
			
			Locale.setDefault(Locale.US);
			String nome;
			double celsius;
			double fahrenheit;
			Scanner leia = new Scanner(System.in); //instanciamento do teclado ("leia")
			
			System.out.println("Digite a temperatura em Celsius: ");
			celsius = leia.nextDouble();
			
			fahrenheit = (celsius*1.8)+32;
			
			System.out.println("Olá! A temperatura em Fahrenheit é: "+fahrenheit);
			
			
		}

}
