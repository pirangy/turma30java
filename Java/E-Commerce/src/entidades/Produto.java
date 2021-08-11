package entidades;

import java.util.Scanner;

public abstract class Produto {

	Scanner leia = new Scanner(System.in);
	// Atributos
	private String codigo;
	private String sabor;
	private double preco;
	private int estoque;

	// Construtores
	public Produto(String codigo, String sabor, double preco, int estoque) {
		super();
		this.codigo = codigo;
		this.sabor = sabor;
		this.preco = preco;
		this.estoque = estoque;
	}

	// Encapsulamento

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	// M�todos
	public void retirarEstoque(int quantidade) {
		
		if(quantidade>estoque) {
			System.out.println("Quantidade indispon�vel.");
		} else {
			this.estoque -= quantidade;
			}
		}
		
	public void compra(char op) {
		if(op=='N') {
			System.out.println("Volte sempre!");
		} else if (op=='S') {
			System.out.println("Digite o c�digo do produto: ");
			codigo = leia.next();
		}
					
	
	}
	
	public void incluirEstoque(int quantidade) {
		if (quantidade<=0) {
			System.out.println("Quantidade inv�lida.");
		} else {
			this.estoque += quantidade;
		}
	}
}
