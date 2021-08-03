/*
 * programa
{
	Exercício 8: 
	"O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e
	dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e
	os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e 
	escreva o custo ao consumidor."
	
	
	//Atenção aos detalhes: Pedir que usuário insira os valores e discriminar as operações matemáticas que devem ser realizadas
	
	funcao inicio(){
	//Legenda: custoFb ("Custo de Fábrica"), dist ("Custo de Distribuição"), imp ("Impostos"), custoCn("Custo ao Consumidor")
	
		real custoFb
		real dist
		real imp
		real custoCn

		escreva("Digite o custo de Fabrica: ")
		leia(custoFb)

		dist = (custoFb*0.28)
		imp = (custoFb*0.45)
		custoCn = (custoFb + dist + imp) 

		escreva("O custo ao consumidor é: " + custoCn)
	}
	
}
 */

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
