package ar.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	public Cuadrado(int b, Punto esqInfIzq) {
		super(b, b, esqInfIzq);
		
	}
	
	@Override
	public boolean esHorizontal() {
		return true;
	}
	

}
