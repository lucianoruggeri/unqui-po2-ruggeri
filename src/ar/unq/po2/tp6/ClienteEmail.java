package ar.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class ClienteEmail {

	private IServidor servidor;
	private String nombreUsuario;
	private String passUsuario;
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	public ClienteEmail(IServidor servidor, String nombreUsuario, String pass) {
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passUsuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.add(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		//GENERAR EL CORREO DESDE ESTA CLASE VIOLA EL SRP?
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	
	}
}
