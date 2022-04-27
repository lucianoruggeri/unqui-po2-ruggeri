package ar.unq.po2.tp4;

public class Ingreso {
	
	protected String mesDePercepcion;
	protected String concepto;
	private double monto;

	public Ingreso(String mes, String concepto, double monto) {
		this.mesDePercepcion = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public double montoImponible() {
		return this.getMonto();
	}

}
