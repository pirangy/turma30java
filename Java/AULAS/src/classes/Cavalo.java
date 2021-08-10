package classes;

import classes.Animal;

public class Cavalo extends Animal {

	public static void main(String[] args) {
		
		Animal cavalo = new Animal("Marco", 8);
		
		System.out.println(cavalo.getNome()+"\n"+cavalo.getIdade());
		cavalo.emitirSom("Iuuhr");
		cavalo.realizarAcao("Corre");
		}
	
}
