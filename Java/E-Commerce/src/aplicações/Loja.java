package aplicações;

import java.util.*;
import entidades.Pizza;
import entidades.Produto;
import entidades.Salgado;

public class Loja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List <Produto> carrinho = new ArrayList<>();

		List <Produto> cardapioPizza = new ArrayList <>();
		List <Produto> cardapioSalgado = new ArrayList <>();

		
		cardapioPizza.add(new Pizza("G5-1", "Mussarela", 25.00, 10, "M/G"));
		cardapioPizza.add(new Pizza("G5-2", "Calabresa", 25.00, 10, "M/G"));
		cardapioPizza.add(new Pizza("G5-3", "Portuguesa", 25.00, 10, "M/G"));
		cardapioPizza.add(new Pizza("G5-4", "Frango", 25.00, 10, "M/G"));
		cardapioPizza.add(new Pizza("G5-5", "Milana", 25.00, 10, "M/G"));

		cardapioSalgado.add(new Salgado("G5-6","Coxinha", 5.00, 10, "P/M/G"));
		cardapioSalgado.add(new Salgado("G5-7","Pão Pizza", 5.00, 10, "P/M/G"));
		cardapioSalgado.add(new Salgado("G5-8","Pastel", 5.00, 10, "P/M/G"));
		cardapioSalgado.add(new Salgado("G5-9","Presunto/Queijo", 5.00, 10, "P/M/G"));
		cardapioSalgado.add(new Salgado("G5-10","Salsicha", 5.00, 10, "P/M/G"));
		
		//Mostrar todo o catálogo de produtos	
		
		System.out.println("Você deseja comprar? [S/N]");
		
		char op = leia.next().toUpperCase().charAt(0);
		do {	
			
			System.out.println("Deseja comprar pizza [P] ou salgado [S]?");
			char op2 = leia.next().toUpperCase().charAt(0);
			
			if (op2=='P') {
				System.out.println("COD\t\tPRODUTO\t\t\t\tVALOR R$\t\tESTOQUE");
				for(Produto menu : cardapioPizza) {
					System.out.println(menu.getCodigo()+"\t\t"+menu.getSabor()+"\t\t\t\t"+menu.getPreco()+"\t"+menu.getEstoque());
				}
			} else if (op2 == 'S') {
				System.out.println("COD\t\tPRODUTO\t\t\t\tVALOR R$\t\tESTOQUE");
				for(Produto menu : cardapioSalgado) {
					System.out.println(menu.getCodigo()+"\t\t"+menu.getSabor()+"\t\t\t\t"+menu.getPreco()+"\t"+menu.getEstoque());
				}
			}

			/*System.out.println("Digite a quantidade desejada: ");
			int quantidade = leia.nextInt();
			if (){
				System.out.println("Digite o tamanho desejado: [M/G]");
			} else {
				System.out.println("Digite o tamanho desejado: [P/M/G]");
			}*/
			
		} while (op=='S');
		
		
		/*System.out.println("CODIGO\tBICHO");
        int x=0;
        for (Pet bicho : lista) {
            System.out.println(x+"\t"+bicho.getRaca());
            x++;
        }
        
        System.out.println("Selecione o codigo de um bicho :");
        x = leia.nextInt();
        System.out.println("Bicho escolhido para compra : "+lista.get(x).getRaca());
        carrinho.add(new Pet( lista.get(x).getRaca()));
        
        for (Pet compras : carrinho) {
            System.out.println("Bicho comprado :"+compras.getRaca());
        }*/
		
		//System.out.println("");

		/*List <Pet> lista = new ArrayList<>();
        List <Pet> carrinho = new ArrayList<>();


        lista.add(new Cachorro("PITBULL",true));
        lista.add(new Gato("SIAMES",true));
        lista.add(new Ave("PAPAGAIO",true));*/
		
	}

}
