package ar.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmpresaTest {
	
	
	
	public static void main(String[] args) {
		
		Empresa coca = new Empresa("Coca", 2022);
		EmpleadoPlantaPermanente luciano = new EmpleadoPlantaPermanente("Luciano", "Calle 123", "Soltero", LocalDate.of(1995, 2, 6), 100000, 0, 0);
		EmpleadoContratado carlos = new EmpleadoContratado("Carlos", "Calle 245", "Casado", LocalDate.of(1965, 3, 12), 100000, 123, "Efectivo");
		EmpleadoPlantaTemporaria camila = new EmpleadoPlantaTemporaria("Camila", "Calle 345", "Casada", LocalDate.of(1994, 4, 12), 100000, LocalDate.of(2023,2,2), 10);
		
		coca.addEmpleado(camila);
		coca.addEmpleado(carlos);
		coca.addEmpleado(luciano);
		coca.liquidacionDeSueldos();
		
		System.out.println("Coca");
		System.out.println("Total sueldos Brutos: " + coca.totalSueldosBrutos());
		System.out.println("Total retenciones: " +coca.totalRetenciones());
		System.out.println("Total sueldos netos: " +coca.totalSueldosNetos());
		
		System.out.println("--------------------");
			
		for ( ReciboDeHaberes item : coca.getRecibos() ) {
			System.out.println("Recibo de " + item.getNombreDelEmpleado());
			System.out.println("Direccion " +item.getDireccion());
			System.out.println("Día " +item.getFechaDeEmision());
			
			List<Concepto> conceptos = item.getDesgloce();
			
			for ( Concepto concepto : conceptos ) {
				System.out.println(concepto.getTipo()+ ": " + concepto.getValor());
				
			}
			System.out.println("Sueldo Neto: " + item.getSueldoNeto());
			System.out.println("--------------------");
			
			
			
		}
		
		
	}

}
