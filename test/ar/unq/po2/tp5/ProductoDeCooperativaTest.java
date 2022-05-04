package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoDeCooperativaTest {

	private ProductoDeCooperativa jabon;

	@BeforeEach
	public void setUp() {
		jabon = new ProductoDeCooperativa(100, 2);
	}

	@Test
	public void testGetPrecio() {
		assertEquals(90, jabon.getPrecio());
	}

	@Test
	public void testGetStock() {
		assertEquals(2, jabon.getStock());
		jabon.decrementarStock();
		assertEquals(1, jabon.getStock());

	}
}
