package ar.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja  {
	
	private List<IPagable> pagables;	
	private IAgencia miAgencia;
	
	public Caja() {
		
		this.pagables = new ArrayList<IPagable>();
		
	}
	
	public void setAgencia(IAgencia agencia) {
		this.miAgencia = agencia;
	}
	
	public void agregarPagable(IPagable p) {
		
		this.pagables.add(p);
		p.procesar(this);
				
	}

	
	public double montoTotal() {
		
		double total = 0;
		
		for(IPagable item:pagables) {
			total += item.getPrecio();
		}
				
		return total;
		
	}

	public void informarAgenciaPagoDe(Factura factura) {
		miAgencia.registrarPago(factura);
	}
	
		
	
	
}
