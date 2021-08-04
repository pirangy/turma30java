package introducao;

import java.util.*;
public class Copinha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Time timeNovo= new Time();
		Time timeExtra = new Time();
		String time1="SANTOS", time2="SPFC", time3="PALMEIRAS", time4="CORINTHIANS";
		int ponto1=0, ponto2=0, ponto3=0, ponto4=0;
		
		String times[] = new String[4];//vetor
		int pontos[] = {0,0,0,0};//vetor
		timeNovo.nome = "JUVENTUS";
		timeNovo.pontos = 3;
		
		timeExtra.nome = "NACIONAL";
		timeExtra.pontos = 2;
		
		System.out.println(timeNovo.nome.toLowerCase());
		
		char op='X'; //Opções: G [Ganhou]; P [Perdeu]; E [Empatou]
		
		/*
		 * para(inteiro x=1;x<=4;x++)
		 * { escreva(time1+"G [ganhou], P [Perdeu] ou E [Empatou]: ")
		 *   leia(op)
		 *   se (op=='G')
		 *   	{
		 *   		ponto1=3
		 *   	}
		 *   senao se (op=='E')
		 *   	{
		 *   		ponto1=1
		 *   	}
		 *   senao 
		 *   	{
		 *   		ponto = 0
		 *   	}
		 *
		 * 
		 */
		for(int x=1;x<=4;x++)			//laço de tamanho definido
		{
			System.out.println(time1+" G [ganhou], P [Perdeu] ou E [Empatou]: ");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='G') 
				{
					ponto1 += 3; //totalizador
				}
			else if (op=='E')
				{
					ponto1 += 1; //totalizador
				}
			else if (op == 'P')
				{
					ponto1 += 0; //totalizador
				} 
			else 
				{
					System.out.println("Opção inválida. Reinicie o programa.");
				}
				
		
			System.out.println(time2+" G [ganhou], P [Perdeu] ou E [Empatou]: ");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='G') 
				{
					ponto2 += 3; //totalizador
				}
			else if (op=='E')
				{
					ponto2 += 1; //totalizador
				}
			else if (op == 'P')
				{
					ponto2 += 0; //totalizador
				} 
			else 
				{
					System.out.println("Opção inválida. Reinicie o programa.");
				}
			
			
			System.out.println(time3+" G [ganhou], P [Perdeu] ou E [Empatou]: ");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='G') 
				{
					ponto3 += 3; //totalizador
				}
			else if (op=='E')
				{
					ponto3 += 1; //totalizador
				}
			else if (op == 'P')
				{
					ponto3 += 0; //totalizador
				} 
			else 
				{
					System.out.println("Opção inválida. Reinicie o programa.");
				}
			
			
			System.out.println(time4+" G [ganhou], P [Perdeu] ou E [Empatou]: ");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='G') 
				{
					ponto4 += 3; //totalizador
				}
			else if (op=='E')
				{
					ponto4 += 1; //totalizador
				}
			else if (op == 'P')
				{
					ponto4 += 0; //totalizador
				} 
			else 
				{
					System.out.println("Opção inválida. Reinicie o programa.");
				}
			
			
			System.out.println();
			System.out.println("TABELA");
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time1,ponto1);
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time2,ponto2);
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time3,ponto3);
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time4,ponto4);
	
		}
	}

}
