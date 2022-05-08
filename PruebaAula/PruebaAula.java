package ar.edu.unlam.pb2.PruebaAula;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.Alumno.Alumno;
import ar.edu.unlam.pb2.Aula.Aula;

public class PruebaAula {

	@Test
	public void queSePuedaAgregarUnAlumno() {

		String nombre = "";
		String apellido = "";
		Integer dni = 0;
		Integer legajo = 0;
		Boolean elUsuarioEstaActivo = false;
		
		Alumno alumnoUno = new Alumno(nombre, apellido, dni, legajo, elUsuarioEstaActivo);
		Aula comision1 = new Aula();
		
		comision1.agregarAlumnoAlAula(alumnoUno);
		
		Integer alumnosEsperados = 1;
		Integer alumnosObtenidos = comision1.obtenerCantidadDeAlumnos(); 
		
		assertEquals(alumnosObtenidos,alumnosEsperados);
	
		
	}
	
	@Test
	public void queSePuedaQuitarAlumno() {

		String nombre = "";
		String apellido = "";
		Integer dni = 0;
		Integer legajo = 0;
		Boolean elUsuarioEstaActivo = false;
		
		Alumno alumnoUno = new Alumno(nombre, apellido, dni, legajo, elUsuarioEstaActivo);
		Aula comision1 = new Aula();
		
		comision1.quitarAlumnoDelAula(alumnoUno);
		
		Integer alumnosEsperados = 0;
		Integer alumnosObtenidos = comision1.obtenerCantidadDeAlumnos(); 
		
		assertEquals(alumnosObtenidos,alumnosEsperados);
		
		
		
	}
	
	@Test
	public void queSePuedaSaberSiElAulaEstaLlena() {

		String nombre = "";
		String apellido = "";
		Integer dni = 0;
		Integer legajo = 0;
		Boolean elUsuarioEstaActivo = false;
		
		Alumno alumnoUno = new Alumno(nombre, apellido, dni, legajo, elUsuarioEstaActivo);
		Aula comision1 = new Aula();
		
		comision1.agregarAlumnoAlAula(alumnoUno);
		Boolean valorResultado = comision1.estaLlena();
		Boolean valorEsperado = true;
		
		assertEquals(valorResultado,valorEsperado);
		
		
	}
}
