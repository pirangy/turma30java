package entities;

public class Ave extends Pet{
	
	//Atributo
	private boolean voa;

	//Construtor
	public Ave(String raca, boolean voa) {
		super(raca);
		this.voa=voa;
	}
	
	//Sobrecarga de construtor
	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa=voa;
	}

	//Encapsulamento
	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	
	public void emiteSom() {
		System.out.println("Emitindo o som do bicho: AHH-AH!");
	}
	

}
