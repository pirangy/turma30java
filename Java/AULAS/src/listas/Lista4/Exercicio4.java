/*
 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe,
 *  em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as 
 *  informa��es deste objeto no console.
 */

package listas.Lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Funcionario_4 funcionario1 = new Funcionario_4();
		
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario1.nome=leia.next();
		
		System.out.println("Digite o departamento do funcion�rio: ");
		funcionario1.departamento=leia.next();
		
		System.out.println("Digite o ano de entrada na empresa: ");
		funcionario1.anoEntrada=leia.nextInt();
		
		System.out.println("Nome: "+funcionario1.nome+"\nDepartamento: "+funcionario1.departamento);
		funcionario1.tempoCarreira(2021);//execu��o do m�todo "tempoCarreira()", da classe Funcionario_4, que imprime o tempo de carreira do funcion�rio
		
		
	}

}
