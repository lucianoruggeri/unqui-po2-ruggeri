package ar.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private String nombre;
	private List<Ingreso> ingresosPercibidos;

	public Trabajador(String string) {
		this.nombre = string;
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}

	public double getTotalPercibido() {
		double total = 0;
		for(Ingreso ingreso:ingresosPercibidos) {
			total+=ingreso.getMonto();
		}
		return total;
		
	}

	public void addIngreso(Ingreso ingreso) {
		this.ingresosPercibidos.add(ingreso);		
	}

	public double getMontoImponible() {
		double total = 0;
		for(Ingreso ingreso:ingresosPercibidos) {
			total+=ingreso.montoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible()* 0.02;
	}

}
