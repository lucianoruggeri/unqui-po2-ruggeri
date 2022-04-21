package ar.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre;
	private List<Persona> equipo;
	
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre=nombre;
		this.equipo= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Persona> getEquipo() {
		return equipo;
	}
	
	public void addPerson(Persona person) {
		equipo.add(person);
	}
	
	public int promedioEdad() {
		int edades = 0;
		
		for(Persona persona:equipo) {
			edades += persona.edad();
		}
		
		
		return edades/this.getEquipo().size();
	}

}
