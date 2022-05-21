package ar.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public boolean evaluarSolicitud(SolicitudDeCredito solicitud) {
		return solicitud.esAceptable();
	}
	
	public void otorgarCredito(SolicitudDeCredito solicitud) {
		this.transferir(solicitud.getMonto(),solicitud.getCliente());
	}
	
	private void transferir(double monto, Cliente cliente) {
		cliente.recibir(monto);
		
	}

	public double montoTotalAPagar() {
		double monto = 0;
		for(SolicitudDeCredito solicitud:this.solicitudesAprobadas()) {
			monto += solicitud.getMonto();
		}		
		return monto;
	}
	
	public List<SolicitudDeCredito> solicitudesAprobadas(){
		
		List<SolicitudDeCredito> solicitudesAprobadas = new ArrayList<SolicitudDeCredito>();
		for(SolicitudDeCredito solicitud : solicitudes) {
			if(this.evaluarSolicitud(solicitud)){
				solicitudesAprobadas.add(solicitud);
			}
		}
		return solicitudesAprobadas;
	}
	
	
	

}
