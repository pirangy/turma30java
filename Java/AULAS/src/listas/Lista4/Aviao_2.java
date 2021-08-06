package listas.Lista4;

public class Aviao_2 {
	
	//Atributos da Classe Avião
	public String modelo;
	public String marca;
	public int anoFabricacao;
	
	//Métodos da Classe Avião
	public void tempoCirculacao(int anoAtual)
	{
		System.out.println("Anos em circulação: "+(anoAtual-anoFabricacao)+" anos.");
	}
	
}
