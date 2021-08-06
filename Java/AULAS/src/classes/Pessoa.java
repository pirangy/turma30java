package classes;

public class Pessoa {

	//Atributos da Classe
	private String nome;
	private int anoNascimento;
	private String cpf;
	private char pronome; //M,F,E
	private boolean ativo;
	
	//Ap�s atributos, "tudo � m�todo(par�nteses)"
	
	//Construtores
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf)
	{
		this.nome=nome;
		this.cpf=cpf;
	}
	

	public Pessoa(String nome, int anoNascimento, String cpf, char pronome, boolean ativo) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.cpf = cpf;
		this.pronome = pronome;
		this.ativo = ativo;
	}
	
	
	//Encapsulamentoe - Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getPronome() {
		return pronome;
	}

	public void setPronome(char pronome) {
		this.pronome = pronome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	//M�todos
	public void mostrarIdade()
	{
		System.out.println(2021-anoNascimento);
	}
	
	public int calcIdade(int anoAtual)
	{
		return anoAtual - anoNascimento;
	}
	
}
