package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuadradoTest {

	Rectangulo a = new Cuadrado(2, new Punto());
	
	@Test
	void testArea() {
		int area = a.area();
		assertEquals(4,area);		
	}
	
	@Test
	void testPerimetro() {
		int perimetro = a.perimetro();
		assertEquals(8,perimetro);		
	}
	
	@Test
	void testEsHorizontal() {
	
		assertEquals(true,a.esHorizontal());		
	}
	

}