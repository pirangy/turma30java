package introducao;


import java.util.*;
public class TesteFuncao {

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		String nome;
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		linhaBasica();
		System.out.printf("%s sua idade é %d\n",nome,(2021-anoNascimento));
		linhaBasica();
		System.out.println("Olha, tu é "+tue()); // !!!PONTO DE PARADA NO ESTUDO!!!
	
	}

	//Criar função de linha (imprime somente uma linha)
	
	public static void linhaBasica()
	{
		System.out.println("------------------------------");
	}
	
	public static void linha(int tamanho)
	{
		for (int x=1;x<=tamanho;x++)
		{
			System.out.println("-");
		}
		System.out.println();
	}
	
	public static String tue(int ano)
	{
		int idade;
		idade = 2021-ano;
		String resposta = "";
		if (idade<13)
		{
			resposta = "criança";
		}
		else if (idade<18)
		{
			resposta = "adolescente";
		}
		else if (idade<30)
		{
			resposta = "jovem";
		}
		else if (idade<45)
		{
			
		}
		else
		{
			resposta = "tu é cringe.";
		}
		
		return resposta;
	}
	
}
