package listas.Lista4;

public class Clientes_1 {

	public String nome;
	public int codigo;
	public int anoNascimento;
	
	public void idade(int anoAtual)
	{
		System.out.println("Idade: "+(anoAtual-anoNascimento));
	}
	
}
