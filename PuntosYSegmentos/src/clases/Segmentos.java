package clases;

public class Segmentos {
	
	Punto a;
	Punto b;
	
	/**
	 * crea un segmento con los valores por defecto
	 */
	public Segmentos() {
		this.a=new Punto(0, 0);
		
		this.b=new Punto(1, 1);

	}
	public Segmentos(Punto a,Punto b) {
		if (a.getX()==b.getX()&& a.getY()==b.getY()) {
			throw new IllegalArgumentException("Los dos puntos son iguales");
		} else {
			this.a=a;
			this.b=b;
		}

	}
	public Punto getA() {
		return a;
	}
	public Punto getB() {
		return b;
	}
	
	@Override
	public String toString() {
		String mensaje="[";
		mensaje+=this.a.toString();
		mensaje+=",";
		mensaje+=this.b.toString();
		mensaje+="]";
		
		return mensaje;
	}
	
	/**
	 * metodo para calcular la distancia de un segmento entre dos puntos
	 * @return distancia del segmento en metros
	 */
	public double distancia() {
		double distancia;
		
		distancia=Math.sqrt( Math.pow( ( this.b.getX() - this.a.getX() ), 2) +  Math.pow( ( this.b.getY() - this.a.getY() ), 2));
		
		return distancia;
		
	}

}
