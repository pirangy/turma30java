package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class CadFunc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia  = new Scanner(System.in);
		
		List<Funcionario> folhaPagamento = new ArrayList<>();
		
		char op; //saída do laço
		do {
			System.out.println("Tipo de Funcionário: funcionario ou terceiro? [F/T]");
			char tipoFuncionario = leia.next().toUpperCase().charAt(0); //lembrando que a variável pode ser criada dentro do laço ou fora dele
			System.out.println("Digite a matrícula: ");
			String matricula = leia.next().toUpperCase();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor da hora: R$ ");
			double valorPorHora = leia.nextDouble();
			
			if(tipoFuncionario == 'T') {
				System.out.println("Digite o valor do adicional: R$");
				double adicional = leia.nextDouble();
				folhaPagamento.add(new Terceiro(matricula,horasTrabalhadas,valorPorHora,adicional));
			} else if(tipoFuncionario == 'F') {
				folhaPagamento.add(new Funcionario(matricula,horasTrabalhadas,valorPorHora));
			}
			System.out.println("Continua? [S/N]: ");
			op = leia.next().toUpperCase().charAt(0);
			
		} while (op=='S');
		
		for (Funcionario func: folhaPagamento) {
			System.out.printf("%s seu salário é R$%.2f",func.getMatricula(),func.salario());
		}
		
	}

}
