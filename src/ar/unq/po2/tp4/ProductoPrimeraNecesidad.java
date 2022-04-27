package ar.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
		
	}
	
	@Override
	public double getPrecio() {
		
		return this.precio * (1 - this.descuento/100);
	}
	
	

}
