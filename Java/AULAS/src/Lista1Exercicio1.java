/*
 * programa
{
	//Exerc�cio 1: "Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias."
	//Aten��o aos detalhes: Se atentar aos valores correspondentes
	
	funcao inicio(){
	
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro totalDias
	
		escreva("Digite quantos anos voc� tem: ")
		leia(anos)
		escreva("Digite quantos meses: ")
		leia(meses)
		escreva("Agora, digite quantos dias: ")
		leia(dias)
		
		totalDias = (anos*365) + (meses*30) + dias
		escreva("Sua idade em dias � " +totalDias + " dias!")
	}

	//Possibilidades: comentar qual a l�gica por tr�s das etapas.
}
 */
import java.util.Scanner;
public class Lista1Exercicio1 {

	public static void main (String [] args)
		{
			
			Scanner leia = new Scanner(System.in);
			int anos;
			int meses;
			int dias;
			int totalDias;
			
			System.out.println("Digite quantos anos voc� tem: ");
			anos = leia.nextInt();
			System.out.println("Digite quantos meses: ");
			meses = leia.nextInt();
			System.out.println("Agora, digite quantos dias: ");
			dias = leia.nextInt();
			
			totalDias = (anos*365)+(meses*30)+dias;
			System.out.println("Sua idade em dias �: "+totalDias+" dias.");
		
		}
	
}
