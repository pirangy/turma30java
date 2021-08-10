package entidades;

public class Revista extends Produto{
	
	//Atributos
	private String editora;
	//Construtores
	public Revista(String codigo, String nome, double valor, int estoque, String editora) {
		super(codigo, nome, valor, estoque);
		this.editora = editora;
	}
	//Encapsulamento
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	//Métodos
}
