package programas;

public class Aluno {
	
	//Inicialmente:
	
	
	//Atributos (parece com variável, apesar de não ser)
	public String nome; //Atributo de Aluno: nome
	public String matricula; //Atributo de Aluno: matricula
	public boolean ativo; //Atributo de Aluno: ativo
	public int nota; //Atributo: nota
	public int anoNascimento;
	
	//Sobrecarga (mais do mesmo, todos abaixo podem ter sobrecarga, Atributos não possuem)
	//Construtores (peãozada)
	//Encapsulamento (segurança/getters and setters)
	//Métodos
	public void mostraIdade()
	{
		System.out.println("A idade é "+(2021-anoNascimento));
	}
	
	//sobrecarga de método
	public void mostraIdade(int anoAtual)
	{
		System.out.println("a idade é "+(anoAtual-anoNascimento));
	}
	public void mostraIdade(int anoAtual, int anoNascimentoPessoa)
	{
		System.out.println("a idade é "+(anoAtual-anoNascimentoPessoa));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//Posteriormente:
	//polimorfismo
	//herança
	//abstração
	//delegação
	//override (annotation)
	
}
