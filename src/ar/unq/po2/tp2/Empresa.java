package ar.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	

	private String nombre;
	private int cuit;
	private List<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	public Empresa(String nombre, int cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public int totalSueldosNetos() {
		int total = 0;
		for(Empleado empleado : empleados) {
			total += empleado.sueldoNeto();
		}
		return total;
	}
	
	public int totalSueldosBrutos() {
		int total = 0;
		for(Empleado empleado : empleados) {
			total += empleado.sueldoBruto();
		}
		return total;
	}
	
	public int totalRetenciones() {
		int total = 0;
		for(Empleado empleado : empleados) {
			total += empleado.retenciones();
		}
		return total;
	}
	
	public ReciboDeHaberes generarRecibo(Empleado empleado) {
		
			return new ReciboDeHaberes(
				empleado.nombre,
				empleado.direccion, 
				LocalDate.now(),
				empleado.sueldoBruto(),
				empleado.sueldoNeto(),
				empleado.generarListaDeConceptos()
				);
		
	}
	
	public void liquidacionDeSueldos() {
		for(Empleado empleado : empleados) {
			ReciboDeHaberes recibo = this.generarRecibo(empleado);
			recibos.add(recibo);
		}
	}

}
