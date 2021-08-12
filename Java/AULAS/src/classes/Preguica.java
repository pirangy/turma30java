package classes;

public class Preguica extends Animal {
	
	private boolean subir;

	public Preguica(String nome, int idade, boolean som, boolean subir) {
		super(nome, idade, som);
		this.subir = subir;
	}
	
	public void subir() {
		if (subir) {
			System.out.printf("\nPreguiça está subindo em árvore!");
		}
		else {
			System.out.printf("\nPreguiça não está subindo em árvore!");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("\nZzz...");
	}
	
	
}
