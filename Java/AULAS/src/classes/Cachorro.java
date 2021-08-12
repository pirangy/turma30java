package classes;

public class Cachorro extends Animal {

	private boolean correr;
	
	public Cachorro(String nome, int idade, boolean som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;
	}
	
	public void corre() {
		if (correr) {
			System.out.printf("\nCachorro est� correndo!");
		}
		else {
			System.out.printf("\nCachorro n�o est� correndo!");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("\nAU AU AU AU");
	}

	
}
