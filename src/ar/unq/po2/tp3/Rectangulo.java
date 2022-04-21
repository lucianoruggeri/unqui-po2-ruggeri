package ar.unq.po2.tp3;

public class Rectangulo {
	
	private int base;
	private int altura;
	private Punto esqInfIzq;
	private Punto esqSupIzq;
	private Punto esqInfDer;
	private Punto esqSupDer;
	
	public Rectangulo(int b,int h, Punto esqInfIzq) {
		
		this.base = b;
		this.altura=h;
		this.esqInfIzq=esqInfIzq;
		this.esqSupIzq= new Punto(esqInfIzq.getX(),esqInfIzq.getY()+h);
		this.esqInfDer= new Punto(esqInfIzq.getX()+b,esqInfIzq.getY());
		this.esqSupDer= new Punto(esqInfIzq.getX()+b,esqInfIzq.getY()+h);	
		
	}

	public int area() {
		return this.base * this.altura;
	}
	
	public int perimetro() {
		return (this.base + this.altura)*2;
	}
	
	public boolean esHorizontal() {
		
		return this.base>this.altura;

	}
}
