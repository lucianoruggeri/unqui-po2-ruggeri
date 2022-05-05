package ar.unq.po2.tp5;

import java.time.LocalDate;

public class Persona implements INombrable {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre,int year,int month,int day) {
		this.nombre = nombre;
		this.fechaDeNacimiento = LocalDate.of(year,month,day);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		return LocalDate.now().getYear() - this.getFechaDeNacimiento().getYear();
	}

	public boolean esMayor(Persona persona) {
		return this.edad() > persona.edad();
	}
}