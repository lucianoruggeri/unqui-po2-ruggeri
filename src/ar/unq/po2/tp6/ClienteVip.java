package ar.unq.po2.tp6;

import java.time.LocalDate;

public class ClienteVip extends Cliente {

	public ClienteVip(String nombre, String apellido, String direccion, LocalDate fechaDeNacimiento,
			double sueldoNetoMensual, double saldo) {
		super(nombre, apellido, direccion, fechaDeNacimiento, sueldoNetoMensual, saldo);
		
	}



}
