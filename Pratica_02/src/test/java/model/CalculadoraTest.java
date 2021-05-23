package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Calculadora;

public class CalculadoraTest{
	
	/*Testando para valor adjacente inferior ao minimo*/
	@Test
	public void valorlimiteinvalidoinferior()
	{
		Calculadora num1 = new Calculadora(-1,-1);
		Calculadora num2 = new Calculadora(-1,-1);
		Calculadora result = Calculadora.soma(num1, num2);
		assertNull(result);
	}
	
	/*Testando para o valor minimo*/
	@Test
	public void valorlimiteinferior()
	{
		Calculadora num1 = new Calculadora(0,0);
		Calculadora num2 = new Calculadora(0,0);
		Calculadora result = Calculadora.soma(num1, num2);
		assertEquals(0,result.getReal());
		assertEquals(0,result.getImg());
	}
	
	/*Testando para o valor maximo*/
	@Test
	public void valorlimitemaximo()
	{
		Calculadora num1 = new Calculadora(9,9);
		Calculadora num2 = new Calculadora(9,9);
		Calculadora result = Calculadora.soma(num1, num2);
		assertEquals(18,result.getReal());
		assertEquals(18,result.getImg());
	}
	
	/*Testando para valor adjacente superior ao maximo*/
	@Test
	public void valorlimiteinvalidosuperior()
	{
		Calculadora num1 = new Calculadora(10,10);
		Calculadora num2 = new Calculadora(10,10);
		Calculadora result = Calculadora.soma(num1, num2);
		assertNull(result);
	}
	
}
