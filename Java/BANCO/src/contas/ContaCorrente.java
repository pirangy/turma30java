package contas;

import banco.Conta;

public class ContaCorrente extends Conta {

	//Atributos
	private int contadorTalao;
	
	//M�todo
	public void pediTalao(double saldo) {
		if (contadorTalao<=3) {
			saldo = saldo-30;
		} else {
			System.out.println("Quantidade n�o permitida.");
		}
	}

	//Construtor
	public ContaCorrente(int numero, String nomeCliente, double saldo, int contadorTalao) {
		super(numero, nomeCliente);
		this.contadorTalao = contadorTalao;
	}
	
	
}
