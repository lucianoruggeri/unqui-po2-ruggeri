package ar.unq.po2.tp5;

public class Producto {
	
	private double precioBase;
	private int stock;
	
	public Producto(double precioBase, int stock) {
		
		this.precioBase = precioBase;
		this.stock = stock;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getPrecio() {
		
		return this.getPrecioBase();
	}
	
	public int getStock() {
		return stock;
	}
		
	public void decrementarStock() {
		
		stock = this.getStock()-1;
	}
	
	


	


}
