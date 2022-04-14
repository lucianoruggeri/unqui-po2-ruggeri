package ar.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		return this.sueldoBasico + this.pagaPorHorasExtras();
	}

	@Override
	public List<Concepto> generarListaDeConceptos() {
		List<Concepto> conceptos = new ArrayList<Concepto>();		
		conceptos.add(new Concepto("Sueldo Bruto", this.sueldoBruto()));
		conceptos.add(new Concepto("Sueldo Basico", this.sueldoBasico));
		conceptos.add(new Concepto("Cantidad De horas extras", this.pagaPorHorasExtras()));
		conceptos.add(new Concepto("Retenciones", this.retenciones()));
		conceptos.add(new Concepto("Aportes Jubilatorios", this.aportesJubilatorios()));
		conceptos.add(new Concepto("Obra Social", this.obraSocial()));
		
		return conceptos;
	}

	public int pagaPorHorasExtras() {		
		return this.cantHorasExtras * 40;
	}

}
