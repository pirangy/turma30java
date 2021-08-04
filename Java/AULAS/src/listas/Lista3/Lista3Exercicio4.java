/*
 * Uma empresa desenvolveu uma pesquisa para saber as
 *  características psicológicas dos indivíduos de uma
 * 	região.
 *  Para tanto, a cada uma das pessoas era perguntado:
 *   idade, sexo (1-feminino / 2-masculino / 3-Outros),
 *    e as opções 
 *    (1, se a pessoa era calma;
 *     2, se a pessoa era nervosa e 
 *     3, se a pessoa era agressiva).
 *    Pede-se para elaborar um sistema que permita ler os dados de
 *    150 pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.
 */

package listas.Lista3;

import java.util.Scanner;
public class Lista3Exercicio4 
{
	public static void main (String [] args)
	{
		Scanner leia = new Scanner(System.in);
		//Variáveis
		int idade;
		char sexo, temperamento, op='S'; //ler um caractere de 3 opções (1-feminino/2-masculino/3-outros e 1-calma/2-nervosa/3-agressiva); char é usado para números que não serão calculados
		
		int contadorPessoas=0;
		final int LIMITE_PESSOAS_ENTREVISTADAS=3;
		
		int numeroPessoasCalmas=0,numeroMulheresNervosas=0,numeroHomensAgressivos=0,numeroOutrosCalmos=0,numeroPessoasNervosasMais40Anos=0,numeroPessoasCalmasMenos18Anos=0; //variáveis contadoras
		
		while(contadorPessoas < LIMITE_PESSOAS_ENTREVISTADAS && op=='S')
		{
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite \n1-Feminino\n2- Masculino\n3-Outros: ");
			sexo = leia.next().charAt(0);
			System.out.println("Digite o temperamento \n1-Pessoa Calma\n2-Pessoa Nervosa\n3-Pessoa Agressiva");
			temperamento = leia.next().charAt(0);
			
			contadorPessoas++; //contador: assegura que o número de repetições atenda às condições (fuga do laço)

			
			System.out.println("Continua? S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			
			if(temperamento == '1')
			{
				numeroPessoasCalmas++;
			}
			if(sexo == '1' && temperamento == '2')
			{
				numeroMulheresNervosas++;
			}
			if(sexo=='2' && temperamento =='3')
			{
				numeroHomensAgressivos++;
			}
			if (sexo=='3' && temperamento =='1')
			{
				numeroOutrosCalmos++;
			}
			if (temperamento == '2' && idade > 40)
			{
				numeroPessoasNervosasMais40Anos++;
			}
			if(temperamento == '1' && idade < 18)
			{
				numeroPessoasCalmasMenos18Anos++;
			}
		}
		
		
		System.out.println("Pessoas calmas: "+numeroPessoasCalmas);
		System.out.println("Mulheres nervosas: "+numeroMulheresNervosas);
		System.out.println("Homens agressivos: "+numeroHomensAgressivos);
		System.out.println("Outros calmos: "+numeroOutrosCalmos);
		System.out.println("Pessoas nervosas acima de 40 anos: "+numeroPessoasNervosasMais40Anos);
		System.out.println("Pessoas calmas abaixo de 18 anos: "+numeroPessoasCalmasMenos18Anos);

		
		//Entradas
		
		
		//Processamentos
		//Saídas
	}
}
