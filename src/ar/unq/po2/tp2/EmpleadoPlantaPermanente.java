package ar.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaPermanente extends Empleado {
	
	private int cantDeHijos;
	private int antiguedad;
		
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, int cantDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantDeHijos = cantDeHijos;
		this.antiguedad = antiguedad;
	}
	

	@Override
	public int obraSocial() {
		
		return this.sueldoBruto() * 10/100 + this.cantDeHijos * 20;
	}

	@Override
	public int aportesJubilatorios() {
		
		return this.sueldoBruto() * 15/100;
	}

	@Override
	public int sueldoBruto() {
		
		return this.sueldoBasico + this.salarioFamiliar();
	}

	public int salarioFamiliar() {
		
		return this.asignacionHijos() + this.asignacionConyugue() + this.asignacionAntiguedad();
	}


	public int asignacionAntiguedad() {
	
		return this.antiguedad * 50;
	}


	public int asignacionConyugue() {
		
		if (this.estadoCivil == "Casado" || this.estadoCivil == "Casada") {
			return 100;
		} else {
			return 0;
		}
	}


	public int asignacionHijos() {
		
		return this.cantDeHijos * 150;
	}


	@Override
	public ReciboDeHaberes generarRecibo() {
		// TODO Auto-generated method stub
		return null;
	}

}
