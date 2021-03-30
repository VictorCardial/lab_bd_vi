package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Calculadora;

public class CalculadoraTest{
	
	/*Testando a criação de uma numero complexo e suas partes reais e imaginarias*/
	@Test
	public void numcomplexo(){
		Calculadora calc = new Calculadora(2,2);
		assertEquals(2,calc.getReal());
		assertEquals(2,calc.getImg());
	}
	
	/*Testando a soma de dois numeros complexos e conferindo as partes reais e imaginarias*/
	@Test
	public void testasoma()
	{
		Calculadora num1 = new Calculadora(2,5);
		Calculadora num2 = new Calculadora(7,3);
		Calculadora result = Calculadora.soma(num1, num2);
		assertEquals(9, result.getReal());
		assertEquals(8, result.getImg());
	}
	
	/*Testando a soma de dois numeros complexos sendo um deles um objeto numero complexo de valor 0 em ambas 
	 * as partes (real e imaginária)*/
	@Test
	public void testasomazero()
	{
		Calculadora num1 = new Calculadora(2,3);
		Calculadora numzero = new Calculadora(0,0);
		Calculadora resp = Calculadora.soma(num1, numzero);
		assertEquals(num1.getReal(),resp.getReal());
		assertEquals(num1.getImg(),resp.getImg());
	}
}
