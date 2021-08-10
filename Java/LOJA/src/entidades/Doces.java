package entidades;

public class Doces extends Produto {
	
	//Atributos
	private String fabricante;
	
	//Construtores
	public Doces(String codigo, String nome, double valor, int estoque, String fabricante) {
		super(codigo, nome, valor, estoque);
		this.fabricante = fabricante;
	}
	//Encapsulamento
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	
	
}
