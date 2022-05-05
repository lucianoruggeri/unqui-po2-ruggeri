package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	private Caja caja;
	private Producto leche;
	private ProductoDeCooperativa jabon;
	
	private Impuesto impuestoMunicipal;
	private Servicio servicioGas;
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		leche = new Producto(100,2);
		jabon = new ProductoDeCooperativa(100,2);
		
		impuestoMunicipal = new Impuesto(1000);
		servicioGas = new Servicio(200,5);
		
		
		
	}
	
	@Test
	public void testagregarProducto() {
		
		assertEquals(0,caja.getProductos().size());
		caja.agregarProducto(jabon);
		caja.agregarProducto(leche);
		assertEquals(2,caja.getProductos().size());
	}
	
	@Test
	public void testagregarFactura() {
		
		assertEquals(0,caja.getFacturas().size());
		caja.agregarFactura(impuestoMunicipal);
		caja.agregarFactura(servicioGas);	
		assertEquals(2,caja.getFacturas().size());
	}
	
	@Test
	public void testMontoTotal() {
		
		assertEquals(0,caja.montoTotal());
		caja.agregarProducto(jabon);
		caja.agregarProducto(leche);
		assertEquals(190,caja.montoTotal());
		
		caja.agregarFactura(impuestoMunicipal);
		assertEquals(1190,caja.montoTotal());
		caja.agregarFactura(servicioGas);
		assertEquals(2190,caja.montoTotal());
		
		
	}
	
	@Test
	public void testRegistrarPago() {
		assertEquals(false,impuestoMunicipal.estaPagada());
		caja.registrarPago(impuestoMunicipal);
		assertEquals(true,impuestoMunicipal.estaPagada());
		
		assertEquals(false,servicioGas.estaPagada());
		caja.registrarPago(servicioGas);
		assertEquals(true,servicioGas.estaPagada());
	}

	

}
