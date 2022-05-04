package ar.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(double precioBase, int stock) {
		super(precioBase, stock);
		
	}
	
	@Override
	public double getPrecio() {
		return this.getPrecioBase()*0.9;
	}

	 
}
