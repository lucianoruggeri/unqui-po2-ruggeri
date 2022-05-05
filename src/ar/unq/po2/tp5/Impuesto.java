package ar.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private double tasaDelServicio;
	
	public Impuesto(double tasa) {
		super();
		this.tasaDelServicio = tasa;
	}

	@Override
	public double getPrecio() {
		
		return tasaDelServicio;
	}
	

}
