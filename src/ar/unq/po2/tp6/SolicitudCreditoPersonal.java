package ar.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudDeCredito {
	

	public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
		super(cliente, monto, plazo);
		
	}

	@Override
	public boolean esAceptable() {
		
		return (this.getCliente().sueldoNetoAnual() > 15000) && (this.cuotaMensual() < this.getCliente().getSueldoNetoMensual()*0.7);
		
	}

}
