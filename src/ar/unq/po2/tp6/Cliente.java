package ar.unq.po2.tp6;

import java.time.LocalDate;

public abstract class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private LocalDate fechaDeNacimiento;
	private double sueldoNetoMensual;
	private double saldo;
	
	
	public Cliente(String nombre, String apellido, String direccion, LocalDate fechaDeNacimiento,
			double sueldoNetoMensual, double saldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.saldo = saldo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int edad() {
		return LocalDate.now().getYear()-this.getFechaDeNacimiento().getYear();
	}
	public double sueldoNetoAnual() {
		return this.getSueldoNetoMensual()*12;
	}


	public void recibir(double monto) {
		this.saldo += monto;		
	}


}
