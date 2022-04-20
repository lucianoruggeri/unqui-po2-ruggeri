package ar.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros;
	
	public Counter() {
		super();
		numeros = new ArrayList<Integer>();
	}
	
	public void addNumber(int num) {
		numeros.add(num);
	}
	
	public int cantDePares() {
		
		int pares = 0;
		
		for(int numero:numeros) {
			if(numero % 2 == 0) {
				pares++;
			}
		}
		
		return pares;
	}
	
	public int cantDeImpares() {
		
		int impares = 0;
		
		for(int numero:numeros) {
			if(numero % 2 != 0) {
				impares++;
			}
		}
		
		return impares;
	}  
	
	public int cantDeMultiplosDe(int nro) {
		
		int multiplos = 0;
		
		for(int numero:numeros) {
			if(numero % nro == 0) {
				multiplos++;
			}
		}
		
		return multiplos;
	}
	
	public int mayorCantDeDigitosPares() {
		
		int nroMayor = numeros.get(0);
		
		for(int numero:numeros) {
			
			int cantDigitosPares = contarDigitosPares(numero);
			
			if(cantDigitosPares > contarDigitosPares(nroMayor)) {
				
				nroMayor = numero;
			}			
			
		}
		
		return nroMayor;
		
	}

	public int contarDigitosPares(int nro) {
		
		int contDigitosPares = 0;
		
		while(nro>0) {
			
			int digito = nro % 10;
			
			if(digito % 2 == 0) {
				contDigitosPares++;
			}
			
			nro = nro/10;
		}
		
		return contDigitosPares;
	}
	
	
	  public int mayorNroMultiploDe(int x, int y) {
	  
	  if(multiplosDe(x,y).isEmpty()) {
		  return -1;
	  }else {
		 return multiplosDe(x,y).get(multiplosDe(x,y).size()-1);
	  	}
	  } 

	  
	  public List<Integer> multiplosDe(int x, int y) {
		  
		  int[] numeros = new int[1000];
		  for(int i=0 ; i<1000 ; i++) {
			  numeros[i] = i+1; 
		  }
		  
		  List<Integer> multiplos = new ArrayList<Integer>();
		  
		  for(int numero:numeros) {
			  if( es_MultiploDe_(numero,x) && es_MultiploDe_(numero,y) ) {
				  multiplos.add(numero);
			  }
		  }
				  
		  return multiplos;
	  }
	  
	  public Boolean es_MultiploDe_(int x, int y) {
		  return (x % y == 0);
	  }
	 
}
