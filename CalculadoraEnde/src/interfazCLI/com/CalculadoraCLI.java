package interfazCLI.com;

public class CalculadoraCLI {
	
	
	
	
/**
 * Es el programa principal de linea de comandos
 * nuestra labor será extraer los métodos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gráfico
 * o al menos tenerlo funcionando
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanzarMenu();

	}

	
	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realziar una operacion sobre ellos
	 */
private static void LanzarMenu() {
	System.out.println("Bienvenido a la calculadora");

}

/**
 * Realiza la suma entre dos números
 * @author Rodrigo
 */
private static int Sumar(int n,int m) {
	System.out.println("Yo sumo dos operadores");
	return n+m;

}

/**
 * Realiza la división entre dos números
 * @author Rodrigo
 */
private static int Dividir(int n,int m) {
	System.out.println("Yo divido dos operadores");
	try {
		if(m==0)
			throws 
		return n/m;	
	}catch() {
		System.out.println("Dividendo igual a 0");
	}

}




}
