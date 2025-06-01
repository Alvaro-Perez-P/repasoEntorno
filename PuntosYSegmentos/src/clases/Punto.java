package clases;

public class Punto {
	
	int x;
	int y;
	
	/**
	 * aqui creo el constructor por defecto
	 */
	public Punto() {
		this.x=0;
		this.y=0;
	}
	
	/**
	 * crea puntos con valores insertados por el usuario
	 * @param x coordenadas en metros
	 * @param y coordenadas en metros
	 */
	
	public Punto(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
	this.y = y;
	}
	
	@Override
	public String toString() {
		String mensaje="(";
		mensaje+=String.valueOf(this.x);
		mensaje+=",";
		mensaje+=String.valueOf(this.y);
		mensaje+=")";
		
		return mensaje;
		
		
		
	}
}
