package es.upm.dit.prog.practica2;

public class Coordenada {

	public double x;
	public double y;
	public Coordenada(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}
	
public double distancia (Coordenada c) {
	double p = c.getX();
	double e = c.getY();
	return Math.sqrt( 
		Math.pow(p-x, 2) + Math.pow(e-y, 2));
	
}

}
