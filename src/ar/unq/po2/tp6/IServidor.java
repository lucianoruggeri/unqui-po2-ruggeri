package ar.unq.po2.tp6;

import java.util.List;

public interface IServidor {

	public void conectar(String nombreUsuario, String passUsuario);

	public List<Correo> recibirNuevos(String nombreUsuario, String passUsuario);

	public void enviar(Correo correo);

}
