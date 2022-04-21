package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {

	Multioperador operador = new Multioperador();
	
	@BeforeEach	
	public void setUp() {
		operador.addNumber(1);
		operador.addNumber(2);
		operador.addNumber(3);
	}
	
	@Test 
	public void sumarTodos() {
		int resultado = operador.sumarTodos();
		assertEquals(6, resultado);
	}
	
	@Test 
	public void restarTodos() {
		int resultado = operador.restarTodos();
		assertEquals(-6, resultado);
	}
	
	@Test 
	public void multiplicarTodos() {
		int resultado = operador.multiplicarTodos();
		assertEquals(6, resultado);
	}
	
}
