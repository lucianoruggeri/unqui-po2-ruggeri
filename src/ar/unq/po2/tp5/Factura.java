package ar.unq.po2.tp5;

public abstract class Factura {
	
	private boolean pagada = false; 
	
	public void pagar() {
		this.pagada = true;
	}
	
	public abstract double getPrecio();
	
	public boolean estaPagada() {
		return this.pagada;
	}
	
}
