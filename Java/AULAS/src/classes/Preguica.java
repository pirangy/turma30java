package classes;

import classes.Animal;

public class Preguica extends Animal {
	
	
	public static void main(String[] args) {
	Animal preguica = new Animal("Zélia", 7);
	
	System.out.println(preguica.getNome()+"\n"+preguica.getIdade());
	preguica.emitirSom("Ahh-ah");
	preguica.realizarAcao("Sobe na árvore");
	}
	
}
