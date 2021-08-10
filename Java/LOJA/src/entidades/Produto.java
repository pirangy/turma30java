package entidades;

public class Produto {
	
	//Atributos (tudo que a Classe é, tem ou está)
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	//Construtores (único método que tem o mesmo nome da Classe, neste caso "Produto")
	public Produto(String codigo, String nome) {//só código e nome
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Produto(String codigo, String nome, double valor, int estoque) { //todos os dados
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if(estoque <0) {
			this.estoque=0;
		} else {
			this.estoque = estoque; //controle de estoque, evitando valores inválidos
		}
	}

	public Produto(String codigo) {//apenas código do produto
		super();
		this.codigo = codigo;
	}

	//Encapsulamento
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}
	
	//Métodos
	public void retirarEstoque(int quantidade) {
		
		if(quantidade>estoque) {
			System.out.println("Quantidade indisponível.");
		} else {
			this.estoque -= quantidade;
		}	
	}
	
	public void incluirEstoque(int quantidade) {
		if (quantidade<=0) {
			System.out.println("Quantidade inválida.");
		} else {
			this.estoque += quantidade;
		}
	}

	/*
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}*/
	
	
	
}

	

