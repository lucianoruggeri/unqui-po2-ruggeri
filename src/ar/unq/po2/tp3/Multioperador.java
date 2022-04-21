package ar.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	private List<Integer>numeros;
	
	public Multioperador() {
		super();
		this.numeros = new ArrayList<Integer>();
	}
	
	public void addNumber(int nro) {
		numeros.add(nro);
	}
	
	public int sumarTodos() {
		
		int resultado = 0;  
		
		for(int nro:numeros) {
			resultado += nro;
		}
		
		return resultado;
	}
	

	public int restarTodos() {
		
		int resultado = 0;  
		
		for(int nro:numeros) {
			resultado -= nro;
		}
		
		return resultado;
	}
	

	public int multiplicarTodos() {
		
		int resultado = 1;  
		
		for(int nro:numeros) {
			resultado *= nro;
		}
		
		return resultado;
	}
	

}
