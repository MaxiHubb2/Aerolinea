package ar.edu.unlam.pb2.PruebaCuenta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import ar.edu.unlam.pb2.CuentasBancarias.Banco;
import ar.edu.unlam.pb2.CuentasBancarias.Cuenta;
import ar.edu.unlam.pb2.CuentasBancarias.CuentaAhorro;
import ar.edu.unlam.pb2.CuentasBancarias.CuentaCorriente;
import ar.edu.unlam.pb2.CuentasBancarias.CuentaSueldo;

public class CuentaTest {

	
	@Test
	public void queSePuedaDepositarDineroEnUnaCuenta() {
		
		String nombreDeBanco = "Santander";
		Banco banco1 = new Banco(nombreDeBanco);
		
		Integer Id = 1;
		Double saldoInicial = 0.0;
		Double montoADepositar = 4000.0;
		Integer idCuenta = 1;
		String nombre = "Maxi";
		
		Cuenta cuenta1DelSueldo = new CuentaSueldo(idCuenta, nombre,saldoInicial);
		
		banco1.agregarCuenta(cuenta1DelSueldo);
		
		Double valorEsperado = 4000.0;
		Double valorObtenido = cuenta1DelSueldo.depositar(banco1, montoADepositar, Id);
		Double saldoConsultado = cuenta1DelSueldo.consultarSaldo(cuenta1DelSueldo);
		
		assertEquals(valorEsperado,valorObtenido);
		
		assertEquals(valorEsperado,saldoConsultado);
		
	}
	
	
	@Test
	public void queSePuedaExtraer500() {
		
		String nombreDeBanco = "Santander";
		Banco banco1 = new Banco(nombreDeBanco);
		
		Integer Id = 1;
		Double saldoInicial = 4000.0;
		Double montoAExtraer = 500.0;
		Integer idCuenta = 1;
		String nombre = "Maxi";
		
		Cuenta cuenta1DelSueldo = new CuentaSueldo(idCuenta, nombre,saldoInicial);
		
		banco1.agregarCuenta(cuenta1DelSueldo);
		
		Double valorEsperado = 3500.0;
		Double valorObtenido = cuenta1DelSueldo.extraerYCobrarPenalidad(banco1, montoAExtraer, cuenta1DelSueldo);
		Double saldoConsultado = cuenta1DelSueldo.consultarSaldo(cuenta1DelSueldo);
		
		assertEquals(valorEsperado,valorObtenido);
		
		assertEquals(valorEsperado,saldoConsultado);
		
	}
	
	
	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaDeAhorro() {
		
		String nombreDeBanco = "Santander";
		Banco banco1 = new Banco(nombreDeBanco);
		
		Integer Id = 1;
		Double saldoInicial = 0.0;
		Double montoADepositar = 4000.0;
		Integer idCuenta = 1;
		String nombre = "Maxi";
		
		Cuenta CuentaAhorro = new CuentaAhorro(idCuenta, nombre,saldoInicial);
		
		banco1.agregarCuenta(CuentaAhorro);
		
		Double valorEsperado = 4000.0;
		Double valorObtenido = CuentaAhorro.depositar(banco1, montoADepositar, Id);
		Double saldoConsultado = CuentaAhorro.consultarSaldo(CuentaAhorro);
		
		assertEquals(valorEsperado,valorObtenido);
		
		assertEquals(valorEsperado,saldoConsultado);
		
	}
	
	@Test
	public void queSePuedaExtraer500DeUnaCuentaDeAhorro() {
		
		String nombreDeBanco = "Santander";
		Banco banco1 = new Banco(nombreDeBanco);
		
		Double saldoInicial = 4000.0;
		Double montoAExtraer = 500.0;
		Integer idCuenta = 1;
		String nombre = "Maxi";
		Integer contadorIngresado = 0;
		
		Cuenta cuenta1DeAhorro = new CuentaAhorro(idCuenta, nombre,saldoInicial,contadorIngresado);
		
		banco1.agregarCuenta(cuenta1DeAhorro);
		
		Double valorEsperado = 3500.0;
		
		Double valorObtenido = cuenta1DeAhorro.extraerYCobrarPenalidad(banco1, montoAExtraer, cuenta1DeAhorro);
		
		Double valorObtenido3 = cuenta1DeAhorro.extraerYCobrarPenalidad(banco1, 1.0, cuenta1DeAhorro);
		Double valorObtenido4 = cuenta1DeAhorro.extraerYCobrarPenalidad(banco1, 1.0, cuenta1DeAhorro);
		Double valorObtenido5 = cuenta1DeAhorro.extraerYCobrarPenalidad(banco1, 1.0, cuenta1DeAhorro);
		Double valorObtenido6 = cuenta1DeAhorro.extraerYCobrarPenalidad(banco1, 1.0, cuenta1DeAhorro);
		Double valorObtenido7 = cuenta1DeAhorro.extraerYCobrarPenalidad(banco1, 1.0, cuenta1DeAhorro);
		
		
		Double valorEsperado1 = 3489.0;
		
		Double saldoConsultado = cuenta1DeAhorro.consultarSaldo(cuenta1DeAhorro);
		
		assertEquals(valorEsperado,valorObtenido);
		assertEquals(valorEsperado1,saldoConsultado);
		
		
	}

	
}
