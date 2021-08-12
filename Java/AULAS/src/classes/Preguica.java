package classes;

public class Preguica extends Animal {
	
	private boolean subir;

	public Preguica(String nome, int idade, boolean som, boolean subir) {
		super(nome, idade, som);
		this.subir = subir;
	}
	
	public void subir() {
		if (subir) {
			System.out.printf("\nPregui�a est� subindo em �rvore!");
		}
		else {
			System.out.printf("\nPregui�a n�o est� subindo em �rvore!");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("\nZzz...");
	}
	
	
}
