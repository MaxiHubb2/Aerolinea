package ar.edu.unlam.pb2.PruebaCalculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.Calculadora.Calculadora;

public class PruebaCalculadora {

	@Test
	
	public void ValoresQueSeSuman() {
		
		Integer valorA = 20;
		Integer valorB = 10;
		Integer resultado = 0;
		Integer esperado = 30;
		
		Calculadora Cassio = new Calculadora();
		resultado = Cassio.sumar(valorA, valorB);
		assertEquals(esperado, resultado);
	}
	
	@Test
	
	public void ValoresQueSeRestan() {
		
		Integer valorA = 20;
		Integer valorB = 10;
		Integer resultado = 0;
		Integer esperado = 10;
		
		Calculadora Cassio = new Calculadora();
		resultado = Cassio.restar(valorA, valorB);
		assertEquals(esperado, resultado);
	}
	
	@Test

	public void ValoresQueSeMultiplican() {

		Integer valorA = 2;
		Integer valorB = 4;
		Integer resultado = 0;
		Integer esperado = 8;

		Calculadora Cassio = new Calculadora();
		resultado = Cassio.multiplicar(valorA, valorB);
		assertEquals(esperado, resultado);
	}

	@Test

	public void ValoresQueSeDividen() {

		Double Denominador = 10.0;
		Double Numerador = 2.0;
		Double resultado = 0.0;
		Double esperado = 5.0;

		Calculadora Cassio = new Calculadora();
		resultado = Cassio.dividir(Denominador, Numerador);
		assertEquals(esperado, resultado);
	}

}
