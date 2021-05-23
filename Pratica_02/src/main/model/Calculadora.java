package model;

public class Calculadora{
	
	/*Classe onde é construido o objeto numero complexo, onde temos os atributos representado as
	 * partes reais e imaginárias desse numero complexo*/
	
	private int real;	
	private int img;
	
	/*Contrutor da classe que usa os parametros para atribuir valor aos atributos*/

	public Calculadora (int real,int img)
	{
		this.real=real;
		this.img=img;
	}
	
	
	  /*Construtor para setar o valor 0 caso o numero complexo seja criado porém não inializado*/

	/*public Calculadora () 
	{
	    this.real = 0;
	    this.img = 0;
	}*/
	
	  /*Método soma de complexos*/

	public static Calculadora soma (Calculadora n1, Calculadora n2) 
	{
		return new Calculadora(n1.real+n2.real,n1.img+n2.img);
		  
		/*if((n1.real >=0 && n1.img >=0) && (n1.real <=9 && n1.img <=9))
		{
			if((n2.real >=0 && n2.img >=0) && (n2.real <=9 && n2.img <=9))
			{
				return new Calculadora(n1.real+n2.real,n1.img+n2.img);
			}
			return null;
		}
		return null;*/
	}
	
	/*Método para a escrita do número*/

	public String toString()
	{
		return "(" + real + ", " + img + "i)";
	}
	
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}
	
}
