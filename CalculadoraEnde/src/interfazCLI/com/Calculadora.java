package interfazCLI.com;


/***
 * En esta clase se gestiona todo el sistema de cáculo de las potencias
 * y sus diferentes excepciones (si las hubiera)
 * 
 * La clase está diseñada de modo que tanto en CLI como en GUI se puede
 * llamar a sus métodos.
 * Estos últimos los diseñará el alumno
 * @author israel
 *
 */

public class Calculadora {

	private float num1,num2;
	
	
	public Calculadora(float num1, float num2)
	{
		
		this.num1=Consola.leeFloat();
		this.num2=Consola.leeFloat();
		
	}
	
	public float sumar(float num1, float num2)
	{
		float resul;
		
		resul=num1+num2;
		
		return resul;
		
	}
	
	
	
	public float dividir(float num1, float num2)
	{
		
		try {
			float resul;
			
			resul=num1/num2;
			
			
			return resul;
			
		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0");

			return -1;
		}

		
	}
	
	
	public float exponente(float num1, float num2)
	{
		
		float resul=0;
		
		for (int i=0;i<num2;i++)
		{
			resul=num1+resul;
			
		}

		
		return resul;
		
		
		
		
	}
	
	
}
