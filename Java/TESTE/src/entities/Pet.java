package entities;

public class Pet {
	
	//Atributos - o que a classe �, tem ou como est�;
	private String raca;
	private char porte;
	private int anoNascimento;
	
	//Construtores - definem como a classe ser� usada no programa principal
	public Pet(String raca) {
		super();
		this.raca = raca;//o atributo "raca" receber� o conte�do da vari�vel "raca", que poder� ser fornecida por usu�rie
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
	
	//M�todos
	
	public void emiteSom() {
		System.out.println("Emitindo o som do bicho: ");
	}
	
	public int idade() {
		return (2021 - anoNascimento);
	}
	
	
	
}
