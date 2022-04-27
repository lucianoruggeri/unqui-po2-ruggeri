package ar.unq.po2.tp4;

import java.time.LocalDate;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantDeHorasExtras;

	public IngresoPorHorasExtras(String mes, String concepto, double monto, int cant) {
		super(mes, concepto, monto);
		this.cantDeHorasExtras = cant;
	}
	
	@Override
	
	public double montoImponible() {
		return 0;
	}
	
	

}
