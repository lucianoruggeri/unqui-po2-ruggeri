package ar.unq.po2.tp5;

public class Mascota implements INombrable {
	
	private String nombre;
	private String raza;
	
	public Mascota(String nombre, String raza) {
		this.nombre=nombre;
		this.raza=raza;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}
	
	

}
