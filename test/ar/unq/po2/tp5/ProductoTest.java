package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	private Producto leche;
	
	@BeforeEach
	public void setUp() {		
		leche = new Producto(100,2);				
	}

	@Test
	public void testGetPrecio() {
		assertEquals(100,leche.getPrecio());
	}
	
	@Test
	public void testGetStock() {
		assertEquals(2,leche.getStock());
		leche.decrementarStock();
		assertEquals(1,leche.getStock());
		
	}

}
