package listas.Lista4;

public class Aviao_2 {
	
	//Atributos da Classe Avi�o
	public String modelo;
	public String marca;
	public int anoFabricacao;
	
	//M�todos da Classe Avi�o
	public void tempoCirculacao(int anoAtual)
	{
		System.out.println("Anos em circula��o: "+(anoAtual-anoFabricacao)+" anos.");
	}
	
}
