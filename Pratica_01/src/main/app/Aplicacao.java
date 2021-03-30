package app;
import model.Calculadora;

public class Aplicacao{
	public static void main (String [] args){
		
		/*Criando dois numeros complexos, printando-os e também sua respectiva soma*/
		Calculadora numero1 = new Calculadora(2,5);
		Calculadora numero2 = new Calculadora(7,3);
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(Calculadora.soma(numero1, numero2));
		
		/*Criando um numero complexo sem inicialização dos atributos, printando e também a sua soma
		 * com o primeiro numero complexo criado*/
		/*Calculadora zerado = new Calculadora();
			
		System.out.println(zerado);
		System.out.println(Calculadora.soma(numero1, zerado));*/
		
	}
}