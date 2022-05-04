package ar.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Producto> productos;
	
	public Caja() {
		
		this.productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto p) {
		
		p.decrementarStock();
		this.productos.add(p);
		
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public double montoTotal() {
		
		double total = 0;
		for(Producto producto:productos) {
			total += producto.getPrecio();
		}
		
		return total;
		
	}
	
}
