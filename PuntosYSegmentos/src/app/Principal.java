package app;

import clases.Punto;
import clases.Segmentos;

public class Principal {

	public static void main(String[] args) {
		Punto p1=new Punto((int)Math.random()*11,((int)Math.random()*11));
		Punto p2=new Punto((int)Math.random()*11,((int)Math.random()*11));
		Punto p3=new Punto((int)Math.random()*11,((int)Math.random()*11));
		Punto p4=new Punto((int)Math.random()*11,((int)Math.random()*11));
		
		Segmentos s1=new Segmentos(p1, p2);
		Segmentos s2=new Segmentos(p3, p4);
		
		double d1= s1.distancia();
		double d2= s2.distancia();
	}

}
