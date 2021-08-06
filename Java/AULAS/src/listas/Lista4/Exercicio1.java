/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.
 */

package listas.Lista4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Clientes_1 cliente1 = new Clientes_1();
		
		System.out.println("Digite o nome do cliente: ");
		cliente1.nome=leia.next();
		
		System.out.println("Digite o código do cliente: ");
		cliente1.codigo=leia.nextInt();
		
		System.out.println("Digite o ano de nascimento do cliente: ");
		cliente1.anoNascimento=leia.nextInt();
		
		System.out.println("Nome: "+cliente1.nome+"\nCódigo: "+cliente1.codigo);
		cliente1.idade(2021);//execução do método "idade()", da classe Clientes_1

			
		
	}

}
