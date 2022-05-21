package ar.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private double monto;
	private int plazo;
	
	

	public SolicitudDeCredito(Cliente cliente, double monto, int plazo) {
		super();
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}
	

	public Cliente getCliente() {
		return cliente;
	}



	public double getMonto() {
		return monto;
	}



	public int getPlazo() {
		return plazo;
	}

	public double cuotaMensual() {
		return this.getMonto()/this.getPlazo();
	}


	public abstract boolean esAceptable();


	
	

}
