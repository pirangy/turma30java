package entities;

public class Cachorro extends Pet {
	
	//Atributo
	private boolean latidoAlto;

	//Construtor
	public Cachorro(String raca, boolean latidoAlto) {
		super(raca);
		this.latidoAlto=latidoAlto;
	}

	//Sobrecarga de construtor
	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto=latidoAlto;
		
	}

	//Encapsulamento
	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}
	
	@Override
	public void emiteSom() {
		System.out.println("Emitindo o som do bicho: AU AU!");
	}
	
}
