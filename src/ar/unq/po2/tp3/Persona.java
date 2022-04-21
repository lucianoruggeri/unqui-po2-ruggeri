package ar.unq.po2.tp3;

import java.time.LocalDate;


public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre,String apellido, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		return  LocalDate.now().getYear() - fechaDeNacimiento.getYear();
	}
	
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();		
	}
	
	
}
