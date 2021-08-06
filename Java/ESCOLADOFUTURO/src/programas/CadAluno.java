package programas;

import java.util.*;
public class CadAluno {

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner (System.in);
		
		String alunes [] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};																																						
		int notas [] = new int [39];
		String matriculas [] = new String[39]; //MAT-0X
		boolean ativo [] = new boolean [39]; //true
		
		
		System.out.println("MAT\tSTATUS\tNOTA\tNOME\n");
		for (int i= 0;i<39;i++) //laço "for", pois sabemos quantas vezes queremos rodar (número de alunos: 39)
		{
			notas[i]=0;
			ativo[i]=true;
			matriculas[i]="MAT-0"+(i+1);
			if(ativo[i]==true)
			{
			System.out.println(matriculas[i]+"\t"+"ATIVO\t"+notas[i]+"\t"+alunes[i]);
			}
			else
			{
			System.out.println(matriculas[i]+"\t"+"INATIVO\t"+notas[i]+"\t"+alunes[i]);
			}
			//System.out.println(matriculas[i]+"\t"+ativo[i]+"\t"+notas[i]+"\t"+alunes[i]);
			//pesquisar operador tenário "?" (laço "if" dentro de um Syso)
		}
	}
}
		
		
		/*char op='S', status;
		String auxCod;
		double auxNota=0;
		*/
		
		
		
		/*for(int i=0; i<alunes.length; i++)
		{
			if(i>8)
			{
				matriculas[i] = "MAT-"+(i+1);
			}
			else
			{
				matriculas[i] = "MAT-0"+(i+1);
			}

		}
		
		for (int i=0; i<alunes.length;i++)
		{
			ativo[i] = true;
		}
		
		System.out.println("MATRÍCULAS\tALUNOS\n");
		for(int i=0; i<alunes.length; i++)
		{
			System.out.printf("%s \t %s \n",matriculas[i],alunes[i]);
		}
		
		do
		{
			System.out.println("INFORME O CÓDIGO DO ALUNO");
			auxCod = leia.next().toUpperCase();
			System.out.println("INFORME O CÓDIGO DO ALUNO");
			auxNota = leia.nextDouble();
			System.out.println("ALUNE ESTÁ ATIVO [A] OU INATIVO [I]: ");
			status = leia.next().toUpperCase().charAt(0);
			
			for(int i=0;i<alunes.length;i++)
			{
				if(matriculas.equals(auxCod))
				{
					notas[i] = auxNota;
				}
			}

			
			
			
			
		}while(op=='S');
		
		
		
		
	}	
}
*/


//mostrar todos os alunos
//laço:
//pedir pela matrícula: 1 aluno
//informar a nota deste aluno
//informar se o aluno ainda continua ativo ou não [usuárie não pode digitar "true" ou "false"]
//fazer o processo até que a pergunta "Continua? Sim [S] ou Não [N]?" seja "não";
//mostrar todos os alunos com nota pela regra:
//até 5 - estude mais;
//acima de 5 - ótimo, continue assim
//aluno inativo ou aluno ativo baseado no true ou false de ativo;
//somente dos alunos que tem nota.