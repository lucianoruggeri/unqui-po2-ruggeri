package ar.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoContratado extends Empleado {
	
	private int nroDeContrato;
	private String medioDePago;
	private int retencionPorGastosAdministrativos = 50;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, int nroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.nroDeContrato = nroDeContrato;
		this.medioDePago = medioDePago;
		
	}

	@Override
	public int obraSocial() {
		return 0;
	}

	@Override
	public int aportesJubilatorios() {
		return 0;
	}

	@Override
	public int sueldoBruto() {
		return this.sueldoBasico; 
	}
	
    @Override
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retencionPorGastosAdministrativos;
	}
	
	@Override
	public List<Concepto> generarListaDeConceptos() {		
			
		List<Concepto> conceptos = new ArrayList<Concepto>();		
		conceptos.add(new Concepto("Sueldo Bruto", this.sueldoBruto()));
		conceptos.add(new Concepto("Sueldo Basico", this.sueldoBasico));
		conceptos.add(new Concepto("Retenciones", this.retenciones()));
		conceptos.add(new Concepto("Gastos Administrativos Contractuales", this.retencionPorGastosAdministrativos));
		
		return conceptos;
		
		/* return new ReciboDeHaberes(
				this.nombre,
				this.direccion, 
				LocalDate.now(),
				this.sueldoBruto(),
				this.sueldoNeto(),
				conceptos
				);
	   */
	}
	
	
}
