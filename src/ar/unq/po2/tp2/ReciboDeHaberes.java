package ar.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;

public class ReciboDeHaberes {
	

	private String nombreDelEmpleado;
	private String direccion;
	private LocalDate fechaDeEmision;
	private int sueldoBruto;
	private int sueldoNeto;
	private List<Concepto>desgloce;
	
	public ReciboDeHaberes(String nombreDelEmpleado, String direccion, LocalDate fechaDeEmision, int sueldoBruto,
			int sueldoNeto, List<Concepto> desgloce) {
		super();
		this.nombreDelEmpleado = nombreDelEmpleado;
		this.direccion = direccion;
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloce = desgloce;
	}

	public String getNombreDelEmpleado() {
		return nombreDelEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}

	public int getSueldoBruto() {
		return sueldoBruto;
	}

	public int getSueldoNeto() {
		return sueldoNeto;
	}

	public List<Concepto> getDesgloce() {
		return desgloce;
	}
	
	
}
