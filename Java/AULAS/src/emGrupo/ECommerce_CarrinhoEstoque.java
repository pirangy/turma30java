package emGrupo;

import java.util.*;
public class ECommerce_CarrinhoEstoque {

	Scanner leia = new Scanner (System.in);
	
	
	for() //Abertura: Carrinho, Estoque e Validação de Estoque
	{
		if(auxCod == codigo[x]) //se a variável de selecionar código (auxCod) possui o mesmo valor do vetor código (codigo[x])...
		{
			if(quantidade <= estoque[x]) ////... e se variável "quantidade" (de itens) for menor ou igual ao que está no vetor "estoque[x]"...
			{
				total = valor[x] *quantidade // o preço sem icms é o valor do produto no vetor "valor[x]" multiplicado pelo valor da variável "quantidade".
				totalCarrinho += total //o preço total do carrinho de compras é seu valor inicial (0) somado com a variável anterior (total), acumulativo.

				estoque[x] = estoque[x] - quantidade //Atualização de estoque;
				icms = (totalCarrinho) * 0.09 //Cálculo de icms;
				quantidadeCarrinho[contador] = quantidade //Armazena as quantidades colocadas no carrinho a partir da variável "quantidade";
				produtoCarrinho[contador] = produto[x] //Armazena os produtos colocados no carrinho a partir do vetor "produto[x]";
				contador++ //Incrementa

				System.out.println("codigo[x],\"\\t\", produto[x],\"\\t Unidades \",quantidade, \"\\t Valor total \", (total),\"\\n\""); //Informa Produto e Quantidades selecionadas;
				System.out.println("Deseja continuar comprando?(V) ou Prosseguir para opções de pagamento?(F)\\n: "); //Pergunta se deseja continuar comprando ou se quer prosseguir para pagamento;
				opcao = leia.next().toUpperCase().charAt(0); //Lê se o usuário digitou V (Continuar Compra) ou F (Prosseguir para Pagamento);
				//!!!FALTA LIMPAR A TELA!!!
				
				if(opcao == V) //continuar comprando; exibição de estoque atualizado
				{
					System.out.println("----------------------------------------------------------------------------------------------------------\n");
					System.out.println("COD\\t\\tPRODUTO\\t\\t\\t\\tVALOR R$\\t\\tESTOQUE\\n");
					System.out.println("----------------------------------------------------------------------------------------------------------\n");
					
					for(x=0; x<10; x++)
					{
						System.out.printf(codigo[x],"\t\t",produto[x],"\t\t\t",valor[x],"\t\t\t",estoque[x],"\n");
					}
				}
			}
		}
	}

	
}


/*para(x=0; x < 10; x++)
 {

se(auxCod == codigo[x])
{//se a variável de selecionar código (auxCod) possui o mesmo valor do vetor código (codigo[x])...
	
	se(quantidade <= estoque[x])
	{//... e se variável "quantidade" (de itens) for menor ou igual ao que está no vetor "estoque[x]"...

		total = valor[x] *quantidade // o preço sem icms é o valor do produto no vetor "valor[x]" multiplicado pelo valor da variável "quantidade".
		totalCarrinho += total //o preço total do carrinho de compras é seu valor inicial (0) somado com a variável anterior (total), acumulativo.
		
		estoque[x] = estoque[x] - quantidade //Atualização de estoque;
		icms = (totalCarrinho) * 0.09 //Cálculo de icms;
		quantidadeCarrinho[contador] = quantidade //Armazena as quantidades colocadas no carrinho a partir da variável "quantidade";
		produtoCarrinho[contador] = produto[x] //Armazena os produtos colocados no carrinho a partir do vetor "produto[x]";
		contador++ //Incrementa
		
		escreva(codigo[x],"\t", produto[x],"\t Unidades ",quantidade, "\t Valor total ", (total),"\n")//Informa Produto e Quantidades selecionadas;
		escreva( "Deseja continuar comprando?(V) ou Prosseguir para opções de pagamento?(F)\n: ")
		leia(opcao)
		limpa()
		
		se(opcao == 'V' ou opcao == 'v')
		{ //continuar comprando; exibição de estoque atualizado
			
			escreva("----------------------------------------------------------------------------------------------------------\n")
			escreva("COD\t\tPRODUTO\t\t\t\tVALOR R$\t\tESTOQUE\n")
			escreva("----------------------------------------------------------------------------------------------------------\n")
			
			para (x=0; x<10; x++)
			{
				escreva(codigo[x],"\t\t",produto[x],"\t\t\t",valor[x],"\t\t\t",estoque[x],"\n")
			}

		} 
*/