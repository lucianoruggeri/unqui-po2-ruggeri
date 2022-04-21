package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {
	
	Punto a; 
	Punto b;

	@BeforeEach
	void setUp() {
		
	 a = new Punto();
	 b = new Punto(1,1);
	
	}
	
	@Test
	void testMoverPunto() {
		a.moverPuntoA(2,2);
		assertEquals(a.getX(),2);
		assertEquals(a.getY(),2);
	}

	@Test
	void testSumarPunto() {
		Punto c = b.sumarPuntoCon(a);
		assertEquals(c.getX(),1);
		assertEquals(c.getY(),1);
		
	}
}
