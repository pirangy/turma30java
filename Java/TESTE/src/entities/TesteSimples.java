package entities;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TesteSimples {

	@Test
	void test() {

	//Cenário
		int valor1=-10, valor2=20;
		int resultado;
		
	//Execução
		resultado = valor1+valor2;
		
	//Verificação
		Assert.assertEquals(resultado, 10);
		
	}

}
