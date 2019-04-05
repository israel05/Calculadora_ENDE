package interfazCLI.com;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Clase que contiene la interfaz
 * @author Rodrigo
 */
public class Ventana extends JFrame {
	
	private HashMap<String,JButton> hashBotones;
	
	private JTextArea pantalla;

	/**
	 * Constructor de clase Ventana
	 * @author Rodrigo
	 */
	Ventana(){
		super();
		
		dibujarVentana();
		
		pack();
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	/**
	 * Funcion para dibujar y crear la ventana
	 * @author Rodrigo
	 */
	private void dibujarVentana() {
		
		this.setLayout(new GridLayout(5,1));
		this.setPreferredSize(new Dimension(600,600));
		
		crearBotones();
		
		//fila1
		
		JPanel fila1 = new JPanel();
		
		
		pantalla = new JTextArea();
		
		pantalla.setPreferredSize(new Dimension(200,200));
		
		pantalla.setEditable(false);
		
		
		fila1.add(pantalla);
		
		
		this.getContentPane().add(fila1);
		
		//fila2
		
		JPanel fila2 = new JPanel();
		
		aniadirBotonesNumeros(7,9,fila2);
		aniadirBotonOperacion("+",fila2);
		aniadirBotonOperacion("C",fila2);
		
		this.getContentPane().add(fila2);
		
		//fila3
		
		JPanel fila3 = new JPanel();
		
		aniadirBotonesNumeros(4,6,fila3);
		aniadirBotonOperacion("-",fila3);
		aniadirBotonOperacion("/",fila3);
		
		this.getContentPane().add(fila3);
		
		//fila3
		
		JPanel fila4 = new JPanel();
				
		aniadirBotonesNumeros(1,3,fila4);
		aniadirBotonOperacion("x",fila4);
		aniadirBotonOperacion("sqr",fila4);
				
		this.getContentPane().add(fila4);
		
		//fila3
		
		JPanel fila5 = new JPanel();
						
		aniadirBotonesNumeros(0,0,fila5);
		aniadirBotonOperacion("=",fila5);
		aniadirBotonOperacion("^",fila5);
		aniadirBotonOperacion("log",fila5);
		aniadirBotonOperacion("bin",fila5);
						
		this.getContentPane().add(fila5);
		
		
		
	}
	
	
	
	/**
	 * Metodo para crear los botones de la calculadora y guardarlos en un hashmap, crea los ActionListener correspondientes
	 * @author Rodrigo
	 */
	private void crearBotones() {
		
		hashBotones = new HashMap<String,JButton>();
		
		//numeros
		for(int i=0;i<10;i++) {
			
			hashBotones.put(Integer.toString(i), new JButton(Integer.toString(i)));
			
			hashBotones.get(Integer.toString(i)).addActionListener(new ListenerBoton(Integer.toString(i)));
			
		}
		
		
		//borrar
		crearBotonOperacion("C");
		//igual
		crearBotonOperacion("=");
		//sumar
		crearBotonOperacion("+");
		//restar
		crearBotonOperacion("-");
		//dividir
		crearBotonOperacion("/");
		//multiplicar
		crearBotonOperacion("x");
		//exp
		crearBotonOperacion("^");
		//raiz
		crearBotonOperacion("sqr");
		//log
		crearBotonOperacion("log");
		//binario
		crearBotonOperacion("bin");
		
		
		
	}
	
	
	/**
	 * Metodo para crear los botones de operaciones
	 * @author Rodrigo
	 */
	private void crearBotonOperacion(String simbolo) {
		
		hashBotones.put(simbolo, new JButton(" "+simbolo+" "));
		
		hashBotones.get(simbolo).addActionListener(new ListenerBoton(simbolo));
		
	}
	
	/**
	 * Metodo para añadir a la interfaz los botones numéricos
	 * @author Rodrigo
	 */
	private void aniadirBotonesNumeros(int desde,int hasta,JPanel fila) {
		
		for(int i=desde;i<=hasta;i++) {
			fila.add(hashBotones.get(Integer.toString(i)));
		}
				
	}
	
	/**
	 * Método para añadir a la interfaz los botones de operacion
	 * @author Rodrigo
	 */
	private void aniadirBotonOperacion(String operacion,JPanel fila) {
			
		fila.add(hashBotones.get(operacion));
				
	}
	
	
	/**
	 * Método main
	 * @author Rodrigo
	 */
	public static void main(String[] args) {


		new Ventana();
	}
	
	
	/**
	 * Clase listener de los botones, imprime en pantalla el texto del botón o el resultado de la operación
	 * @author Rodrigo
	 */
	public class ListenerBoton implements ActionListener {
		
		private String simbolo;
		
		ListenerBoton(String simbolo){
			this.simbolo=simbolo;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {

			//añadir numero o simbolo correspondiente al boton en la pantalla
			
			if(simbolo.equals("=")) {

				try {
					pantalla.setText(Double.toString(realizarOperacion()));
				} catch (ErrorDivision0 e1) {
					pantalla.setText(e1.getMessage());
				}
				
			}else {
				
				if(simbolo.equals("C")){
					pantalla.setText("");
				}else {
			
					pantalla.append(hashBotones.get(simbolo).getText());
				}
				
			}
			
		}
		
		
		
	}
	
	/**
	 * Metodo que realiza la operación con el texto en pantalla
	 * @author Rodrigo
	 */
	private double realizarOperacion() throws ErrorDivision0 {

		String[] arrayoperacion = separar();
		
		double num1 = Double.parseDouble(arrayoperacion[0]);
		
		double num2 = Double.parseDouble(arrayoperacion[2]);
		
		switch (arrayoperacion[1]) {
		
		case "+":
			
			return CalculadoraCLI.Sumar(num1,num2);
			
			
		case "-":
			
			
			break;
			
		case "x":
			break;
			
		case "/":
			
			return CalculadoraCLI.Dividir(num1,num2);

			
		case "^":
			break;
			
		case "log":
			
			return CalculadoraCLI.Logaritmo(num1,num2);

		
		
		
		}
		
		return 0.0;
		
		
		
	}
	
	/**
	 * Método que separa en un array de longitud 3 el texto en pantalla
	 * @author Rodrigo
	 */
	private String[] separar() {
		
		String instruccion = pantalla.getText();
		
		String primnum = instruccion.substring(0, instruccion.indexOf(' '));
		
		String operacion = instruccion.substring(instruccion.indexOf(' ')+1,instruccion.indexOf(' ')+2);
		
		String segnum = instruccion.substring(instruccion.indexOf(' ')+3, instruccion.length());
		
		
		String[] arrayoperacion = {primnum,operacion,segnum};
		
		return arrayoperacion;
		
	}

}
