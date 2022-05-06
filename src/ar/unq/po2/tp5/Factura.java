package ar.unq.po2.tp5;

public abstract class Factura implements IPagable {
	
	private boolean pagada = false; 
	
	public void pagar() {
		this.pagada = true;
	}
	
	public void procesar(Caja caja) {
		this.avisarQueSoyFactura(caja);;
	}
	
	public abstract double getPrecio();
	
	public boolean estaPagada() {
		return this.pagada;
	}
	
	public void avisarQueSoyFactura(Caja caja) {
		caja.informarAgenciaPagoDe(this);
	}
}
