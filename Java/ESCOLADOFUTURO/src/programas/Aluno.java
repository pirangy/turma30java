package programas;

public class Aluno {
	
	//Inicialmente:
	
	
	//Atributos (parece com vari�vel, apesar de n�o ser)
	public String nome; //Atributo de Aluno: nome
	public String matricula; //Atributo de Aluno: matricula
	public boolean ativo; //Atributo de Aluno: ativo
	public int nota; //Atributo: nota
	public int anoNascimento;
	
	//Sobrecarga (mais do mesmo, todos abaixo podem ter sobrecarga, Atributos n�o possuem)
	//Construtores (pe�ozada)
	//Encapsulamento (seguran�a/getters and setters)
	//M�todos
	public void mostraIdade()
	{
		System.out.println("A idade � "+(2021-anoNascimento));
	}
	
	//sobrecarga de m�todo
	public void mostraIdade(int anoAtual)
	{
		System.out.println("a idade � "+(anoAtual-anoNascimento));
	}
	public void mostraIdade(int anoAtual, int anoNascimentoPessoa)
	{
		System.out.println("a idade � "+(anoAtual-anoNascimentoPessoa));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//Posteriormente:
	//polimorfismo
	//heran�a
	//abstra��o
	//delega��o
	//override (annotation)
	
}
