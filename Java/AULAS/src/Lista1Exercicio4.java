/*
 * programa
{
	//Exercício 4: "Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: "
	//Atenção aos detalhes: Pedir que usuário insira os valores e discriminar as operações matemáticas que devem ser realizadas
	
	funcao inicio(){

		inteiro A
		inteiro B
		inteiro C
		inteiro R
		inteiro S
		inteiro D
	
		escreva("Digite o valor A: ")
		leia(A)
		escreva("Digite o valor B: ")
		leia(B)
		escreva("Digite o valor C: ")
		leia(C)
		
		R = (A+B)^2
		S = (B+C)^2
		D = (R+S)/2	
		escreva("O resultado final é: "+D)
	}

	//Possibilidades: procurar meios de tornar o código mais sucinto.
}
 */
import java.util.Scanner;
public class Lista1Exercicio4 {

	public static void main (String [] args)
		{
			Scanner leia = new Scanner(System.in);
			int A;
			int B;
			int C;
			int R;
			int S;
			int D;
			
			System.out.println("Digite o valor A: ");
			A = leia.nextInt(); 
			System.out.println("Digite o valor B: ");
			B = leia.nextInt(); 
			System.out.println("Digite o valor C: ");
			C = leia.nextInt(); 
			
			R = (A+B)^2;
			S = (B+C)^2;
			D = (R+S)^2;
			
			System.out.println("O resultado final é: "+D);
			
		}
	
}
