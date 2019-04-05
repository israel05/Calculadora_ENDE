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
	
	
	public Calculadora(float num1, float num2){
		this.num1=Consola.leeFloat();
		this.num2=Consola.leeFloat();
	}
	
	//SUMA
	public float sumar(){
		float resul=num1+num2;
		
		return resul;	
	}
	
	//RESTA
	public float restar(){
		float resul=num1-num2;
		
		return resul;	
	}
	
	//MULTIPLICACION
	public float multiplicar(){
		float resul=num1*num2;
		
		return resul;	
	}
	
	//DIVISION
	public float dividir(){
		
		try {
			float resul=num1/num2;
		
			return resul;
		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0");

			return -1;
		}	
	}
	
	//EXPONENCIAL
	public float exponente(){
		
		float resul=0;
		
		for (int i=0;i<num2;i++){
			resul=num1+resul;
			
		}

		return resul;
	}
	
	
	
	
}
