package entities;

public class Gato extends Pet{

	//Atributo
	private boolean miadoAlto;
	
	//Construtor
	public Gato(String raca, boolean miadoAlto) {
		super(raca);
		this.miadoAlto=miadoAlto;
	}

	//Sobrecarga de construtor
	public Gato(String raca, int anoNascimento, boolean miadoAlto) {
		super(raca, anoNascimento);
		this.miadoAlto=miadoAlto;
	}

	//Encapsulamento
	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
	public void emiteSom() {
		if(miadoAlto) {
			System.out.println("MIAU!!!");
		}
		else {
			System.out.println("Emitindo o som do bicho: miau...");
		}
	}
	
	
}
