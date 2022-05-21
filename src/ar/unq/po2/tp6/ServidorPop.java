package ar.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {
	
	
	
	@Override
	public List<Correo> recibirNuevos(String user, String pass) {
		
		this.conectar(user, pass);
		List<Correo> retorno = new ArrayList<Correo>();
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}


	@Override
	public void conectar(String nombreUsuario, String passUsuario) {
		   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	@Override
	public void enviar(Correo correo) {
		  //realiza lo necesario para enviar el correo.	
		
	}

}
