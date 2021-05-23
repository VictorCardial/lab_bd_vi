package app;
import model.Calculadora;

public class Aplicacao{
	public static void main (String [] args){
		
		/*soma com valores inferiores ao limite valido*/
		Calculadora numsomanull1 = new Calculadora(-2,-2);
		Calculadora numsomanull2 = new Calculadora(-2,-2);
		System.out.println(Calculadora.soma(numsomanull1, numsomanull2));
		
		/*soma com valores v�lidos dentro do range*/
		Calculadora numero1 = new Calculadora(2,5);
		Calculadora numero2 = new Calculadora(7,3);
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(Calculadora.soma(numero1, numero2));
		
		/*soma com valores invalidos acima do range*/
		Calculadora invalidacima = new Calculadora(10,11);
		Calculadora invalidacima2 = new Calculadora(12,13);
		System.out.println(Calculadora.soma(invalidacima, invalidacima2));
		
		/*Criando um numero complexo sem inicializa��o dos atributos, valor padrao 0*/
		Calculadora zerado = new Calculadora();
		System.out.println(zerado);
	}
}