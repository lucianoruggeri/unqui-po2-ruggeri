package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	private Caja caja;
	private Producto leche;
	private ProductoDeCooperativa jabon;
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		leche = new Producto(100,2);
		jabon = new ProductoDeCooperativa(100,2);
		
	}
	
	@Test
	public void testagregarProducto() {
		
		assertEquals(0,caja.getProductos().size());
		caja.agregarProducto(jabon);
		caja.agregarProducto(leche);
		assertEquals(2,caja.getProductos().size());
	}
	
	@Test
	public void testMontoTotal() {
		
		assertEquals(0,caja.montoTotal());
		caja.agregarProducto(jabon);
		caja.agregarProducto(leche);
		assertEquals(190,caja.montoTotal());
	}

	

}
