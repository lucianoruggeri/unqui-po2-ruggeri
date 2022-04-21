package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	//Se crea el contador
	Counter counter = new Counter();

	@BeforeEach
	public void setUp() throws Exception {	
	
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(434);
	}
	
	//Verifica la cantidad de pares
	
	@Test
	public void testPares() {
	
		int amount = counter.cantDePares();
		assertEquals(amount, 1);
	}
	
	//Verifica la cantidad de impares
	
	@Test
	public void testImpares() {
	
		int amount = counter.cantDeImpares();
		assertEquals(amount,9);
	}
	
	//Verifica la cantidad de multiplos
	
	@Test
	public void testMultiplos() {
		
		int amount = counter.cantDeMultiplosDe(3);
		assertEquals(amount,2);
	}
	
	//Verifica la cantidad de digitos pares de un nro
	
	@Test
	public void testCantDeDigitosParesDeUnNro() {
		
		int amount = counter.contarDigitosPares(2221);
		assertEquals(amount,3);
	}
	
	//Verifica el mayor numero con digitos pares
	
	@Test
	public void testMayorNroConDigitosPares() {
		
		int nro = counter.mayorCantDeDigitosPares();
		assertEquals(nro,434);
	}
	
	//Verificar el mayor multiplo de 3 y 9
	@Test
	
	public void testMayorMultiplo() {
		int nro = counter.mayorNroMultiploDe(3,9);
		assertEquals(nro,999);
	}
	


}
