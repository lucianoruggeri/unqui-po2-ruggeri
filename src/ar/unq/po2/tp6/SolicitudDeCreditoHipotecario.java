package ar.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	
	private Propiedad garantia;

	public SolicitudDeCreditoHipotecario(Cliente cliente, double monto, int plazo,Propiedad garantia) {
		super(cliente, monto, plazo);
		this.garantia=garantia;
	}

	@Override
	public boolean esAceptable() {
		
		return (this.cuotaMensual() < this.getCliente().getSueldoNetoMensual()*0.5)
			   && (this.getMonto() < this.getGarantia().getValorFiscal()*0.7)
			   && (this.getCliente().edad() < 65);
	}

	private Propiedad getGarantia() {

		return garantia;
	}

}
