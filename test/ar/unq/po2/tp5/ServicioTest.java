package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {

	private Servicio servicioGas;
	
	@BeforeEach
	public void setUp() {
		
		servicioGas = new Servicio(200,5);
	}
	
	@Test
	public void testEstaPago() {
		
		assertEquals(false,servicioGas.estaPagada());
		servicioGas.pagar();
		assertEquals(true,servicioGas.estaPagada());
	}
	
	@Test
	public void testPrecio() {
		assertEquals(1000,servicioGas.getPrecio());
	}

}
