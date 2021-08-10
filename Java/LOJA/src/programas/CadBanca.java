package programas;

import entidades.Doces;
import entidades.Revista;

public class CadBanca {

	public static void main(String[] args) {
		
		Revista rev1 = new Revista("004", "REVISTA CRAUDIA", 35.50, 10, "EDITORA ABRIL");
		
		Doces sugar1 = new Doces("010", "BALA YOGURTE", 0.15, 1000, "DOCES MARIA");
		
		sugar1.retirarEstoque(2000);
		rev1.incluirEstoque(-10);
		
		
	}

}
