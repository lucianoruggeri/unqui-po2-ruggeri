package ar.unq.po2.tp4;

public class Producto {
	
	protected String nombre;
	protected double precio;
	protected boolean esPrecioCuidado;
	
	public Producto(String nombre,double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}
	
	public Producto(String nombre,double precio, boolean esPrecioCuidado) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}
	
	
}
