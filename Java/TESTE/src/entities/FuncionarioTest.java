package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FuncionarioTest {

	@Test
	void testSalario() {
		//Cen�rio
		Funcionario func1 = new Terceiro("001",10,10.00,1);
		double salario;
		//Execu��o
		salario=func1.salario();
		//Verifica��o
		Assert.assertEquals(salario, 101.00);
		
	}
	
	@Test
	void testSalarioNegativo() {
		//Cen�rio
		Funcionario func1 = new Terceiro("001",10,-10.00,1);
		double salario;
		//Execu��o
		salario=func1.salario();
		//Verifica��o
		Assert.assertEquals(salario, 1.00);
		
	}

}
