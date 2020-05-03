package es.upm.dit.prog.practica2;

public class Localizacion{
	
	private Coordenada c;
	private Lectura [] lecturas;
	
	public Localizacion(Coordenada c, int i) {
		this.c = c;
		this.lecturas = new Lectura[i];
		
	}
	
	public Coordenada getC() {
		return c;
	}

	public void setC(Coordenada c) {
		this.c = c;
	}
	
	public void setLectura (Lectura l, int n) {
		if (n >= 0 && n<= (lecturas.length -1)) {
			lecturas [n] = l;
		}
	}
	
	public Lectura getLectura(int n) {
		if (n >= 0 && n <= (lecturas.length -1))	{
			return lecturas [n] ;
		}
		return null;
	}

	public void intercambia (int n1, int n2) {
		if (n1>=0 && n1 <= (lecturas.length-1))				
			if (n2>=0 && n2 <= (lecturas.length-1)) {
				Lectura aux = lecturas [n2];
				lecturas [n2] = lecturas [n1];
				lecturas [n1] = aux;
			}
	}
	
	
}

	
	

