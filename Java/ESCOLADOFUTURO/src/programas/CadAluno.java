package programas;

import java.util.*;
public class CadAluno {

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner (System.in);
		
		String alunes [] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corr�a de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","C�ssia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","F�bio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Fl�vio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","Jo�o Pedro Cruz Gomes","Jos� Paulo de Matos Ferreira Neto","Let�cia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Nat�lia Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vin�cios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};																																						
		int notas [] = new int [39];
		String matriculas [] = new String[39]; //MAT-0X
		boolean ativo [] = new boolean [39]; //true
		
		
		System.out.println("MAT\tSTATUS\tNOTA\tNOME\n");
		for (int i= 0;i<39;i++) //la�o "for", pois sabemos quantas vezes queremos rodar (n�mero de alunos: 39)
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
			//pesquisar operador ten�rio "?" (la�o "if" dentro de um Syso)
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
		
		System.out.println("MATR�CULAS\tALUNOS\n");
		for(int i=0; i<alunes.length; i++)
		{
			System.out.printf("%s \t %s \n",matriculas[i],alunes[i]);
		}
		
		do
		{
			System.out.println("INFORME O C�DIGO DO ALUNO");
			auxCod = leia.next().toUpperCase();
			System.out.println("INFORME O C�DIGO DO ALUNO");
			auxNota = leia.nextDouble();
			System.out.println("ALUNE EST� ATIVO [A] OU INATIVO [I]: ");
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
//la�o:
//pedir pela matr�cula: 1 aluno
//informar a nota deste aluno
//informar se o aluno ainda continua ativo ou n�o [usu�rie n�o pode digitar "true" ou "false"]
//fazer o processo at� que a pergunta "Continua? Sim [S] ou N�o [N]?" seja "n�o";
//mostrar todos os alunos com nota pela regra:
//at� 5 - estude mais;
//acima de 5 - �timo, continue assim
//aluno inativo ou aluno ativo baseado no true ou false de ativo;
//somente dos alunos que tem nota.