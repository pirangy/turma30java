package introducao;

import java.util.*;
public class Agenda {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		String agenda [][] = new String [24][31]; //linha representa as horas do dia e vai de 0-23; coluna representa os dias e vai de 0-30
		int auxDia, auxHora;
		char op;
		
		do 
		{
			
			System.out.println("Digite o dia do evento: ");
			auxDia = leia.nextInt()-1; //máscara
			System.out.println("Digite a hora do evento: ");
			auxHora = leia.nextInt();
			leia.nextLine();//limpar buffer de teclado (evita que o programa não funcione corretamente)
			System.out.println("Digite o evento: ");
			agenda [auxHora][auxDia] = leia.nextLine();
			System.out.println("Continua? [S/N]: ");
			op = leia.next().toUpperCase().charAt(0);
		
		} while (op=='S');
		System.out.println("Mostrando agenda: ");
		for (int dia=0;dia<31;dia++)
		{
			for(int hora=0;hora<24;hora++)
			{
				if(agenda[hora][dia] != null)
				System.out.printf("Dia %d - Hora %d: %s\n",dia+1,hora,agenda[hora][dia]);
			}
		}
	}
	

}
