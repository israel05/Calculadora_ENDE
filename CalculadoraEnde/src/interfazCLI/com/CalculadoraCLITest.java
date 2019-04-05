package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase de JUNIT creada para hacer pruebas sobre los métodos que vamos creando
 * Ningún método será dado por válido hasta que no tenga su JUNIT correspondiente 
 * con dos pruebas como mínimo 
 * @author israel
 *
 */

class CalculadoraCLITest {

	@Test
	void testMain() {
		fail("Not yet implemented");
	}
	
	
	/**
	 * Test número 1 sobre el método suma
	 * @author Rodrigo
	 *
	 */
	@Test
	void testSumar1() {
		double solucion = CalculadoraCLI.Sumar(2.0,1.0);
		
		assertEquals(3.0, solucion);
	}
	
	
	/**
	 * Test número 2 sobre el método suma, fallo
	 * @author Rodrigo
	 *
	 */
	@Test
	void testSumar2() {
		double solucion = CalculadoraCLI.Sumar(3.0,1.0);
		
		assertEquals(3.0, solucion);
	}
	
	/**
	 * Test número 1 sobre el método dividir
	 * @author Rodrigo
	 *
	 */
	@Test
	void testDividir1() {
		double solucion;
		try {
			solucion = CalculadoraCLI.Dividir(2.0,1.0);
			assertEquals(3.0, solucion);
		} catch (ErrorDivision0 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * Test número 2 sobre el método dividir, fallo
	 * @author Rodrigo
	 *
	 */
	@Test
	void testDividir2() {
		
		try {
			assertEquals("Division por 0.", CalculadoraCLI.Dividir(3.0,0));
		} catch (ErrorDivision0 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
