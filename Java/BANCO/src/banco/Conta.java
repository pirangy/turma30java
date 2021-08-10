package banco;

public abstract class Conta {
	
	//Atributos
	private int numero;
	private String nomeCliente;
	private double saldo;


	//Construtor
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

	//Encapsulamento
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Métodos
	public void debito(double valorInformado) {
		if (valorInformado>saldo) {
			System.out.println("Operação impossível de ser realizada.");
		} else {
			saldo = saldo - valorInformado;
		};
	}
	
	public void credito(double credito, double valorInformado) {
		
		saldo = saldo + valorInformado;
	}
}
