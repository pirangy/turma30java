/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

package listas.Lista4;

import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		Aviao_2 aviao1 = new Aviao_2();
		
		System.out.println("Digite a marca do avião: ");
		aviao1.marca=leia.next();
		
		System.out.println("Digite o modelo do avião: ");
		aviao1.modelo=leia.next();
		
		System.out.println("Digite o ano de fabricação do modelo: ");
		aviao1.anoFabricacao=leia.nextInt();
		
		System.out.println("Marca: "+aviao1.marca+"\nModelo: "+aviao1.modelo);
		aviao1.tempoCirculacao(2021);//execução do método "tempoCirculacao()", da classe Aviao_1, que imprime o tempo de cirulação do modelo
		
	}

}
