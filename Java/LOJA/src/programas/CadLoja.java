package programas;

import entidades.Produto;

public class CadLoja {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto("001", "CAMISA");
		Produto prod2 = new Produto("002", "CALÇA", 100.50, 10);

		//prod1.setNome("CAMISETA");
		prod2.setValor(100);
		//prod2.setEstoque(1000);
		
		prod2.retirarEstoque(5);
		prod1.incluirEstoque(10);
		
		
		//System.out.println(prod2.getValor()*2);	
		//System.out.println(prod2.getEstoque());
		System.out.println(prod1.getNome()+" quantidade: "+prod1.getEstoque());
		System.out.println(prod2.getNome()+" quantidade: "+prod2.getEstoque());
		prod2.retirarEstoque(2);
		System.out.println(prod2.getNome()+" quantidade: "+prod2.getEstoque());
		prod2.retirarEstoque(5);
		System.out.println(prod2.getNome()+" quantidade: "+prod2.getEstoque());
		
	}

}
