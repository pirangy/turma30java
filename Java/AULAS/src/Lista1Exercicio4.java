/*
 * programa
{
	//Exerc�cio 4: "Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: "
	//Aten��o aos detalhes: Pedir que usu�rio insira os valores e discriminar as opera��es matem�ticas que devem ser realizadas
	
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
		escreva("O resultado final �: "+D)
	}

	//Possibilidades: procurar meios de tornar o c�digo mais sucinto.
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
			
			System.out.println("O resultado final �: "+D);
			
		}
	
}
