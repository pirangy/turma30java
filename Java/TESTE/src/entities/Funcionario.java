package entities;

public class Funcionario {
	
	//Atributos
	private String matricula;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	//Construtor
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		if(horasTrabalhadas<0) {
			this.horasTrabalhadas = 0;
		} else {
		this.horasTrabalhadas = horasTrabalhadas;
		}
		if (valorPorHora <0) {
			this.valorPorHora=0;
		} else {
			this.valorPorHora = valorPorHora;
		}
	}
	
	
	//Encapsulamento
	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorPorHora() {
		return valorPorHora;
	}



	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}


	//Método
	public double salario () {
		return (horasTrabalhadas*valorPorHora);
	}
	
	public double salarioExtra () {
		return 500.00;
	}
}
