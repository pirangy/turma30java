package listas.Lista1;

import java.util.Scanner;
public class Lista1Exercicio8 {

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner (System.in);
		double custoFb;
		double dist;
		double imp;
		double custoCn;
		
		System.out.println("Digite o custo de fábrica: ");
		custoFb = leia.nextDouble();
		
		dist = (custoFb*0.28);
		imp = (custoFb*0.45);
		custoCn = (custoFb+dist+imp);
		
		System.out.println("O custo ao consumidor é: "+custoCn);
		
		
	}

}
