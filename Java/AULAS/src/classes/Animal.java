package classes;

public class Animal {
	
	//Atributos
	private char especie; //1-Cavalo, 2-Cachorro, 3-Preguiça
	private String nome;
	private int idade;
	private String som;
	private String acao;
			
	//Construtores
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Animal(String acao) {
		super();
		this.acao = acao;
	}
	
	

	public Animal(char especie, String nome, int idade, String som, String acao) {
		super();
		this.especie = especie;
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.acao = acao;
	}

	//Encapsulamento
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	


	//Métodos
	public void emitirSom(String som)
	{
		this.som=som;
		System.out.println(som);
	}
	
	public void realizarAcao(String acao)
	{
		this.acao=acao;
		System.out.println(acao);
	}

}
