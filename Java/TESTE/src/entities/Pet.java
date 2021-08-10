package entities;

public class Pet {
	
	//Atributos - o que a classe é, tem ou como está;
	private String raca;
	private char porte;
	private int anoNascimento;
	
	//Construtores - definem como a classe será usada no programa principal
	public Pet(String raca) {
		super();
		this.raca = raca;//o atributo "raca" receberá o conteúdo da variável "raca", que poderá ser fornecida por usuárie
	}

	//Sobrecarga de construtor
	public Pet(String raca, int anoNascimento) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}

	//Encapsulamento
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	//Métodos
	
	public void emiteSom() {
		System.out.println("Emitindo o som do bicho: ");
	}
	
	public int idade() {
		return (2021 - anoNascimento);
	}
	
	
	
}
