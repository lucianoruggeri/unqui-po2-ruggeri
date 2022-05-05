package ar.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaYMascotaTest {

	
	public static void main(String[] args) {
		
		 Persona juli;
		 Persona fabi;
		 Mascota perro;
		 Mascota gato;
		
		juli = new Persona("Julian",1992,5,5);
		fabi = new Persona("Fabian",1990,7,7);
		perro = new Mascota("Lobo","PerroCallejero");
		gato = new Mascota("tigre", "Gata");
		
		List<INombrable> coleccion = Arrays.asList(juli,fabi,perro,gato);	
		
		for(INombrable obj : coleccion) {
			String nombre = obj.getNombre();
			System.out.println(nombre);

		}
		
	}
}

