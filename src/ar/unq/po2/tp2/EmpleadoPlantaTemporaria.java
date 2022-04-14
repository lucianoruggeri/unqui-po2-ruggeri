package ar.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaTemporaria extends Empleado {
	
	private LocalDate fechaFinDeAsignacion;
	private int cantHorasExtras;
	
	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, LocalDate fechaFinDeAsignacion, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinDeAsignacion = fechaFinDeAsignacion;
		this.cantHorasExtras = cantHorasExtras;
	}

	@Override
	public int obraSocial() {
		
		return this.sueldoBruto() * 10/100 + extraMayorDe50Años();
	}

	public int extraMayorDe50Años() {
		if (this.edad() >= 50) {
		return 25;
		} else {
			return 0;
		  }
	}

	@Override
	public int aportesJubilatorios() {		
		return this.sueldoBruto() * 10/100 + this.cantHorasExtras * 5;
	}

	@Override
	public int sueldoBruto() {
		return this.sueldoBasico + this.cantHorasExtras * 40;
	}

	@Override	
	public ReciboDeHaberes generarRecibo() {
		// TODO Auto-generated method stub
		return null;
	}

}
