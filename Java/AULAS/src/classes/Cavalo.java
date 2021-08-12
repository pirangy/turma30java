package classes;

public class Cavalo extends Animal {

	private boolean correr;

	public Cavalo(String nome, int idade, boolean som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;
	}
	
	public void corre() {
		if (correr) {
			System.out.printf("\nCavalo está correndo!");
		}
		else {
			System.out.printf("\nCavalo não está correndo...");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("\nIuhhhrr!");
	}
	
}
