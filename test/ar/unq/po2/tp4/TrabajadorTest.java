package ar.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador charly;
	private Ingreso salario;
	private IngresoPorHorasExtras horas;
	
	@BeforeEach
	public void setUp() {
		charly = new Trabajador("Charly");
		salario = new Ingreso("Enero","Salario",100000);
		horas = new IngresoPorHorasExtras("Enero","Horas Extras",10000,10);
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(0, charly.getTotalPercibido());
		charly.addIngreso(salario);
		charly.addIngreso(horas);
		assertEquals(110000, charly.getTotalPercibido());
		
	}
	
	@Test
	public void testTotalImponible() {
		assertEquals(0, charly.getMontoImponible());
		charly.addIngreso(salario);
		charly.addIngreso(horas);
		assertEquals(100000, charly.getMontoImponible());
	}
	
	@Test
	public void testTotalImpuestoAPagar() {
		assertEquals(0, charly.getImpuestoAPagar());
		charly.addIngreso(salario);
		charly.addIngreso(horas);
		assertEquals(2000, charly.getImpuestoAPagar());
	}

}
