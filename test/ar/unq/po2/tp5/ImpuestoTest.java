package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTest {

	private Impuesto impuestoMunicipal;
	
	@BeforeEach
	public void setUp() {
		
		impuestoMunicipal = new Impuesto(1000);
	}
	
	@Test
	public void testEstaPago() {
		
		assertEquals(false,impuestoMunicipal.estaPagada());
		impuestoMunicipal.pagar();
		assertEquals(true,impuestoMunicipal.estaPagada());
	}
	
	@Test
	public void testPrecio() {
		assertEquals(1000,impuestoMunicipal.getPrecio());
	}
	
}
