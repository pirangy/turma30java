package application;

import entities.Ave;
import entities.Cachorro;
import entities.Gato;

public class TestePet {

	public static void main(String[] args) {

		Cachorro pet1 = new Cachorro("PITBULL",true);
		Gato pet2 = new Gato("PERSA", 2014, true);
		Ave pet3 = new Ave("GRALHA",2018, true);
		
		pet1.setAnoNascimento(2019);
		
		System.out.println(pet1.getRaca()+" "+pet1.idade()+" anos");
		pet1.emiteSom();
		System.out.println(pet2.getRaca()+" "+pet2.idade()+" anos");
		pet2.emiteSom();
		System.out.println(pet3.getRaca()+" "+pet3.idade()+" anos");
		pet3.emiteSom();
		
	}

}
