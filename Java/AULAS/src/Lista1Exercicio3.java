/*
 * programa
{
	//Exerc�cio 3: "Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos."
	//Aten��o aos detalhes: Considerar os segundos restantes da divis�o, declarar vari�vel para eles
	
	funcao inicio(){
	
		inteiro totalSegundos
		inteiro horas
		inteiro minutos
		inteiro segundosRestantes
		inteiro segundos
	
		escreva("Digite quantos segundos dura o evento: ")
		leia(totalSegundos)
	
		horas = totalSegundos/3600
		segundosRestantes = totalSegundos%3600
		minutos = segundosRestantes/60
		segundos = segundosRestantes%60
		
		escreva("O evento dura " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.")
	}
}
 */
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
