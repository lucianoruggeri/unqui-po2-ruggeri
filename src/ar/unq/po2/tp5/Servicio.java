package ar.unq.po2.tp5;

public class Servicio extends Factura {
	
	private double costoXunidad;
	private int unidadesConsumidas;
	
	public Servicio(double costo,int unid) {
		super();
		this.costoXunidad = costo;
		this.unidadesConsumidas = unid;
	}
	
	@Override
	public double getPrecio() {
	
		return this.costoXunidad*this.unidadesConsumidas;
	}

}
