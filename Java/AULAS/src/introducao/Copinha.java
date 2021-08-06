package introducao;

import java.util.*;
public class Copinha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String codTime [] = new String [4];
		String nomesTimes[]= {"SANTOS","SPFC","PALMEIRAS","CORINTHIANS"};
		int pontosTimes[] = {0,0,0,0};
		char op='X'; //Op��es: G [Ganhou]; P [Perdeu]; E [Empatou]
		String auxCod;

		
		
		
		//"CPF-01"
		for (int x=0; x<codTime.length; x++) 
		{
			if(x==9)//o �ndice est� igual a nova, por�m deve-se lembrar que '9' � a d�cima posi��o, pois os �ndices de vetor se iniciam na posi��o '0'
			codTime[x]="CPF-"+(x+1); //somamos x+1 pois o valor inicial de x � zero, em vetor, e n�o queremos um time com c�digo 00
		
			else
			codTime[x] = "CPF-0"+(x+1);
				
		}
		
		System.out.println();
		System.out.println("COD\tTIME	\tPONTOS");
		for(int x=0;x<codTime.length;x++)
		{
			System.out.printf("%s\t%s\t%d\n",codTime[x],nomesTimes[x],pontosTimes[x]);
		}
		
		System.out.println();
		
		for (int x=0; x<3;x++) //la�o que roda o n�mero de rodadas da copinha
		{
			System.out.println("Rodada: "+(x+1));
			
			for (int y=0;y<codTime.length;y++)// la�o que roda todos os times
			{
				
				System.out.println(nomesTimes[y]+" G [Ganhou]; P [Perdeu]; E [Empatou]");
				op = leia.next().toUpperCase().charAt(0);
				
				if (op=='G')
				{
					pontosTimes[y] += 3; //totalizador n�o � contador (soma o total de pontos, n�o contabiliza o n�mero de rodadas)
				}
				
				else if (op=='E')
				{
					pontosTimes[y] += 1; //totalizador n�o � contador (soma o total de pontos, n�o contabiliza o n�mero de rodadas)

				}
				
				else if (op=='P')
				{
					pontosTimes[y] += 0; //totalizador n�o � contador (soma o total de pontos, n�o contabiliza o n�mero de rodadas)

				}
				
				else
				{
					System.out.println("Voc� n�o escolheu um c�digo correto. Nenhuma pontua��o ser� contabilizada.");
				}
			}
		}
		
		//Resultado da Copinha ap�s 3 rodadas
		System.out.println("AP�S 3 RODADAS");
		System.out.println("COD\tTIME	\tPONTOS");
		for(int x=0;x<codTime.length;x++)
		{
			System.out.printf("%s\t%s\t%d\n",codTime[x],nomesTimes[x],pontosTimes[x]);
		}		
		
		
		//Sele��o de time espec�fico para visualiza��o de seus pontos
		System.out.println();
		System.out.println("Digite o c�digo do time que deseja selecionar: ");
		auxCod = leia.next().toUpperCase();
		System.out.println("COD\tTIME	\tPONTOS");
		
		
		//Visualizar pontua��o de time selecionado
		for (int x=0;x<codTime.length;x++)
		{
			if(auxCod.equals(codTime[x]))//igualar o �ndice "auxiliar c�digo" aos valores da String "codTime". Serve para comparar se o que usu�rie digitou � igual ao conte�do da String referenciada. 
			{
				System.out.printf("%s\t%s\t%d\n",codTime[x],nomesTimes[x],pontosTimes[x]);
			}
		}
		
		
		//System.out.printf("o %s tem %d pontos",nomesTimes[0],pontosTimes[0]);
		
		//System.out.println(timeNovo.nome.toLowerCase());
		
		
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
		
		
		/*for(int x=1;x<=4;x++)			//la�o de tamanho definido
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
					System.out.println("Op��o inv�lida. Reinicie o programa.");
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
					System.out.println("Op��o inv�lida. Reinicie o programa.");
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
					System.out.println("Op��o inv�lida. Reinicie o programa.");
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
					System.out.println("Op��o inv�lida. Reinicie o programa.");
				}
			
			
			System.out.println();
			System.out.println("TABELA");
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time1,ponto1);
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time2,ponto2);
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time3,ponto3);
			System.out.printf("Time %s pontos atuais: %s ponto(s)!!\n",time4,ponto4);
	
		}*/
	}

}
