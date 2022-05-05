package ar.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia {
	
	private List<Producto> productos;
	private List<Factura> facturas;
	
	public Caja() {
		
		this.productos = new ArrayList<Producto>();
		this.facturas = new ArrayList<Factura>();
	}
	
	public void agregarProducto(Producto p) {
		
		p.decrementarStock();
		this.productos.add(p);
		
	}
	
	public void agregarFactura(Factura f) {
		
		this.facturas.add(f);
		
	}

	public List<Factura> getFacturas() {
	
	return facturas;
	
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public double montoTotal() {
		
		double totalProductos = 0;
		double totalFacturas = 0;
		
		for(Producto producto:productos) {
			totalProductos += producto.getPrecio();
		}
		
		for(Factura factura:facturas) {
			totalFacturas += factura.getPrecio();
		}
				
		return totalProductos + totalFacturas;
		
	}
	
	public void registrarPago(Factura f) {
		f.pagar();
	}

	

	
	
}
