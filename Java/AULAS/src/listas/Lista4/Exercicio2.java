/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */

package listas.Lista4;

import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		Aviao_2 aviao1 = new Aviao_2();
		
		System.out.println("Digite a marca do avi�o: ");
		aviao1.marca=leia.next();
		
		System.out.println("Digite o modelo do avi�o: ");
		aviao1.modelo=leia.next();
		
		System.out.println("Digite o ano de fabrica��o do modelo: ");
		aviao1.anoFabricacao=leia.nextInt();
		
		System.out.println("Marca: "+aviao1.marca+"\nModelo: "+aviao1.modelo);
		aviao1.tempoCirculacao(2021);//execu��o do m�todo "tempoCirculacao()", da classe Aviao_1, que imprime o tempo de cirula��o do modelo
		
	}

}
