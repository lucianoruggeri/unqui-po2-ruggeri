package ar.unq.po2.tp3;

public class Punto {

	private int x;
	private int y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void moverPuntoA(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Punto sumarPuntoCon(Punto p2) {
		int x = this.getX() + p2.getX();
		int y = this.getY() + p2.getY();
		
		return new Punto(x,y);
	}

	
	
}
