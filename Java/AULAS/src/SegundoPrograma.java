import java.util.Scanner;

/*
 * 
 */
public class SegundoPrograma 
{

		public static void main(String [] args)
		{
			String nome;
			int anoNascimento;
			int idade;
			Scanner leia = new Scanner(System.in); //instanciamento
			
			System.out.println("Digite seu nome: ");
			nome = leia.next();
			System.out.println("Digite seu ano de nascimento: ");
			anoNascimento = leia.nextInt();
			
			idade=2021-anoNascimento;
			
			System.out.println("Oi, "+nome+", sua idade é "+idade+" anos.");
		}
	
}
