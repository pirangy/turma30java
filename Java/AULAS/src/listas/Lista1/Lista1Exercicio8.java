/*
 * programa
{
	Exerc�cio 8: 
	"O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e
	dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e
	os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e 
	escreva o custo ao consumidor."
	
	
	//Aten��o aos detalhes: Pedir que usu�rio insira os valores e discriminar as opera��es matem�ticas que devem ser realizadas
	
	funcao inicio(){
	//Legenda: custoFb ("Custo de F�brica"), dist ("Custo de Distribui��o"), imp ("Impostos"), custoCn("Custo ao Consumidor")
	
		real custoFb
		real dist
		real imp
		real custoCn

		escreva("Digite o custo de Fabrica: ")
		leia(custoFb)

		dist = (custoFb*0.28)
		imp = (custoFb*0.45)
		custoCn = (custoFb + dist + imp) 

		escreva("O custo ao consumidor �: " + custoCn)
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
		
		System.out.println("Digite o custo de f�brica: ");
		custoFb = leia.nextDouble();
		
		dist = (custoFb*0.28);
		imp = (custoFb*0.45);
		custoCn = (custoFb+dist+imp);
		
		System.out.println("O custo ao consumidor �: "+custoCn);
		
		
	}

}
