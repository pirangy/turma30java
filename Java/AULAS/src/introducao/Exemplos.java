package introducao;

import java.util.*;
public class Exemplos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
		
		String nome;
		char opcao; //m, f, e
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Selecione Masculino[M], Feminimo [F] ou Neutro [E]: ");
		opcao = leia.next().charAt(0); 
		
		System.out.println("[Println] O nome digitado foi: "+nome);
		System.out.printf("[Printf] O nome digitado foi: %s",nome);
		System.out.println("\nA quantidade de caracteres no nome digitado é: "+nome.length());
	
		leia.close();


	}

}
