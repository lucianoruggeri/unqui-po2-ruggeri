package ar.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;

public abstract class Empleado {

	
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected LocalDate fechaDeNacimiento;
	protected int sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public int edad() {
		return LocalDate.now().getYear() - this.fechaDeNacimiento.getYear();
	}
	
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

	public int retenciones() {
		return this.aportesJubilatorios() + this.obraSocial();
	}

	public abstract int obraSocial();

	public abstract int aportesJubilatorios();

	public abstract int sueldoBruto();

	public abstract List<Concepto> generarListaDeConceptos();
}
