package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovo {

	public static void main(String[] args) {

		//Aqui est� montada uma lista que pode ter Strings (sem ser vetor)
		
		Scanner leia = new Scanner(System.in);
		int x=0; //tipo primitivo
		Integer y=0; //Wrap Class de int: simula tipo primitivo, mas na forma de uma classe (com mais possibilidades de intera��o)
		Double salario;//Wrap Class de double
		
		String auxNome;
		
		List <String> cadastro = new ArrayList <>();		
		
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMEIRAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTUS"); //a lista n�o tem tamanho, diferentemente das Arrays (vetores e matrizes)
		
		System.out.println("Tamanho da lista: "+cadastro.size());

		cadastro.add(1,"GUARANI");
		
		System.out.println(cadastro.get(4));
		
		for (String time: cadastro) {
			System.out.println(x+" - "+time.toLowerCase());
			x++;
		}
		

		//"For each": roda toda a lista e joga cada nome dentro do apelido
		/*
		for (String time: cadastro) {
			System.out.println(time);
		}*/
		
		//A lista � utilizada para tipos de dados mistos, ao passo que vetores e matrizes trabalham com dados de tipos fixos
		
		//System.out.println("Tamanho da lista: "+cadastro.size());
		System.out.println("Digite o nome do time que voc� deseja apagar: ");
		auxNome = leia.next().toUpperCase();
		x = cadastro.indexOf(auxNome);
		System.out.println("Voc� escolheu o time "+cadastro.get(x)+". Este time ser� apagado.");
		cadastro.remove(x);
		
		System.out.println("NOVA LISTA:");
		
		//Recursivo - Clean Code - Vai imprimir a lista da mesma maneira, sem a necessidade de mais uma vari�vel para servir de �ndice
		for (String time: cadastro) {
			System.out.println(cadastro.indexOf(time)+" - "+time.toLowerCase());
			x++;
		}
		
	}

}
