package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	Rectangulo a = new Rectangulo(2, 3, new Punto());
	
	@Test
	void testArea() {
		int area = a.area();
		assertEquals(6,area);		
	}
	
	@Test
	void testPerimetro() {
		int perimetro = a.perimetro();
		assertEquals(10,perimetro);		
	}
	
	@Test
	void testEsHorizontal() {
	
		assertEquals(false,a.esHorizontal());		
	}
	

}
