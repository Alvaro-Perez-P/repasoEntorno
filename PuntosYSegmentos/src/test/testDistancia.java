package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Punto;
import clases.Segmentos;

class testDistancia {
	Punto a = new Punto(0, 0);
	Punto b = new Punto(1, 1);
	Punto c = new Punto(-1, -1);
	Punto d = new Punto(-2, -2);
	Punto e = new Punto(0, 0);
	Punto f = new Punto(-1, -1);
	Punto g = new Punto(2, 2);
	Punto h = new Punto(2, 2);
	
	Segmentos positivos = new Segmentos(a, b);
	Segmentos negativos = new Segmentos(c, d);
	Segmentos mixto = new Segmentos(e, f);
	
	@Test
	void testDistanciaPostivos() {
		double resultadoObtenido = positivos.distancia();
		double resultadoEsperado = 1.4142135623730951;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testDistanciaNegativos() {
		double resultadoObtenido = negativos.distancia();
		double resultadoEsperado = 1.4142135623730951;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testDistanciaMixtos() {
		double resultadoObtenido = mixto.distancia();
		double resultadoEsperado = 1.4142135623730951;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testExcepcion(){
		Exception excepcion = assertThrows (IllegalArgumentException.class,
		  () -> new Segmentos(g, h)
		);
		String mensajeEsperado = "Los dos puntos son iguales";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}

	
	

}
