package entities;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TesteSimples {

	@Test
	void test() {

	//Cen�rio
		int valor1=-10, valor2=20;
		int resultado;
		
	//Execu��o
		resultado = valor1+valor2;
		
	//Verifica��o
		Assert.assertEquals(resultado, 10);
		
	}

}
