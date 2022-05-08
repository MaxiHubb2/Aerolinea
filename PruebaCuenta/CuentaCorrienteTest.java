package ar.edu.unlam.pb2.PruebaCuenta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.CuentasBancarias.Cuenta;
import ar.edu.unlam.pb2.CuentasBancarias.CuentaCorriente;

public class CuentaCorrienteTest {
	@Test
	public void queSePuedaExtraerMasAllaDelSaldo() {

		Double saldoInicial = 100.0;
		Double montoAExtraer = 200.0;
		Integer idCuenta = 1;
		String nombre = "Maxi";
		
		Cuenta cuentaCorriente1 = new CuentaCorriente(idCuenta,nombre,saldoInicial);
		cuentaCorriente1.setId(idCuenta);
		cuentaCorriente1.setSaldoTotal(saldoInicial);
		
		
		Double valorObtenido = cuentaCorriente1.extraerDineroEnCuenta(montoAExtraer, cuentaCorriente1);
		Double saldoEsperado = 300.0;
		
		assertEquals(saldoEsperado,valorObtenido);
		
	}
	
	@Test
	public void queCalculeElDescubiertoYCalculeSaldoAplicandoDescubierto() {

		Double saldoInicial = 100.0;
		Double montoAExtraer = 300.0;
		Integer idCuenta = 1;
		String nombre = "Maxi";
		
		Cuenta cuentaCorriente1 = new CuentaCorriente(idCuenta,nombre,saldoInicial);
		cuentaCorriente1.setId(idCuenta);
		cuentaCorriente1.setSaldoTotal(saldoInicial);
		
		Double descubiertoAplicado = cuentaCorriente1.extraerYAplicarDescuento(montoAExtraer, cuentaCorriente1);
		Double descubiertoEsperado = 215.0;
		
		Double saldoEsperado = 300.0;
		
		assertEquals(descubiertoEsperado,descubiertoAplicado);
		
	}
		
	
}
