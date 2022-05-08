package ar.edu.unlam.pb2.PruebaFigura;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ar.edu.unlam.pb2.Figuras.Circulo;
import ar.edu.unlam.pb2.Figuras.Cuadrado;
import ar.edu.unlam.pb2.Figuras.Figura;
import ar.edu.unlam.pb2.Figuras.Rectangulo;

public class TestFiguras {

	@Test
	public void queSepuedaInformarElNombreDeUnCirculo() {

		String nombre = "Circulo";
		Circulo circulo = new Circulo(nombre);
		String nombreObtenido = circulo.obtenerNombre();
		assertEquals(nombreObtenido, nombre);
	}

	@Test
	public void queSePuedaInformarElNombreDeUNCuadrado() {
		String nombre = "Cuadrado";
		Cuadrado cuadrado = new Cuadrado(nombre);
		String nombreObtenido = cuadrado.obtenerNombre();
		assertEquals(nombreObtenido, nombre);
	}

	@Test
	public void queSePuedaInformarElColorDeUnCirculo() {
		String nombre = "Circulo";
		String color = "rojo";
		Circulo circulo = new Circulo(nombre, color);
		String colorObtenido = circulo.obtenerColor();
		assertEquals(colorObtenido, color);
	}

	@Test
	public void queSePuedaInformarElColorDeUnaFiguraCuadrado() {
		String nombre = "Cuadrado";
		String color = "rojo";
		Cuadrado cuadrado = new Cuadrado(nombre, color);
		String colorObtenido = cuadrado.obtenerColor();
		assertEquals(colorObtenido, color);
	}

//	@Test
//	public void queSePuedaCrearUnaFiguraDeColorBlanco() {
//		String nombre = "figura";
//		String color = "blanco";
//		Figura figura = new Figura(nombre, color);
//		String colorObtenido = figura.obtenerColor();
//		assertEquals(colorObtenido, color);
//	}

	@Test
	public void queSePuedaObtenerElNombreDeUnaFiguraCuadrada() {
		String nombre = "figura";
		String color = "blanco";
		Figura cuadrado = new Cuadrado(nombre, color, 2.0);
		String nombreObtenido = cuadrado.obtenerNombre();
		assertEquals(nombreObtenido, nombre);
	}

	@Test
	public void quesePuedaCalcularElAreaDeUnaFiguraCuadrada() {
		String nombre = "figura";
		String color = "blanco";
		Double lado = 2.0;
		Double areaEsperada = 4.0;
		Figura cuadrado = new Cuadrado(nombre, color, lado);
		Double areaObtenida = cuadrado.calcularArea();
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	public void quesePuedaCalcularElAreaDeUnaFiguraCircular() {
		String nombre = "figura";
		String color = "blanco";
		Double radio = 2.0;
		Double diametro = 10.0;
		Double areaEsperada = Math.PI*(radio*radio);
		Figura circulo = new Circulo(nombre, color, radio,diametro);
		Double areaObtenida = circulo.calcularArea();
		assertEquals(areaObtenida, areaEsperada);
	}

	@Test
	public void queSePuedaCalcularElPerimetroDeUnaFiguraCircular() {

		String nombre = "figura";
		String color = "blanco";
		Double radio = 2.0;
		Double diametro = 10.0;
		Double perimetroEsperado = Math.PI*diametro;
		Figura circulo = new Circulo(nombre,color,radio,diametro);
		Double perimetroObtenido = circulo.calcularPerimetro();
		assertEquals(perimetroObtenido, perimetroEsperado);
	}

	@Test
	public void queSePuedaCalcularElPerimetroDeUnaFiguraCuadrada() {

		String nombre = "figura";
		String color = "blanco";
		Double lado = 4.0;
		Double perimetroEsperado = lado*4;
		Figura cuadrado = new Cuadrado(nombre,color,lado);
		Double perimetroObtenido = cuadrado.calcularPerimetro();
		assertEquals(perimetroObtenido, perimetroEsperado);
	}
	
	@Test
	public void test() {
		Rectangulo rectangulo = new Rectangulo("Rojo",1.0,2.0);
		Rectangulo rectangulo2 = new Rectangulo("Azul",3.0,6.0);
		Circulo circulo = new Circulo("Blanco", 6.0);
		
		
		List<Figura> contenedor = new ArrayList<>();
		
		contenedor.add(rectangulo2);
		contenedor.add(rectangulo);
		contenedor.add(circulo);
		
		for (Figura figura : contenedor) {
			if(figura instanceof Rectangulo)
//			if(figura.getTipo().equals("Rectangulo"))
				System.out.println(((Rectangulo) figura).getLado());
		}
		
		
	//	Figura circulo = new Circulo("Blanco")
		
	//	System.out.println(((Rectangulo)rectangulo).getLado());
	//	System.out.println(rectangulo.toString());
	//	figura = circulo;
	//	System.out.println(rectangulo.toString());
	//	System.out.println(circulo.getRadio());
		

	
	}
}
