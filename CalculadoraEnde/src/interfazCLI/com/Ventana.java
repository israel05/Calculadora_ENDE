package interfazCLI.com;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ventana extends JFrame{
	
	private JTextArea pantalla;
	private ArrayList<JButton> botonesfila2;
	private ArrayList<JButton> botonesfila3;
	private ArrayList<JButton> botonesfila4;
	
	Ventana(){
		
		
		

		dibujarVentana();
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Interfaz
	 *
	 * @author Rodrigo
	 */
	public void dibujarVentana() {
		
		this.setLayout(new GridLayout(5,1));
		
		//fila 1, pantalla
		JPanel fila1 = new JPanel();
		
		pantalla = new JTextArea();
		pantalla.setPreferredSize(new Dimension(150,200));
		
		fila1.add(pantalla);
		
		this.getContentPane().add(fila1);
		
		//fila2
		JPanel fila2 = new JPanel(new FlowLayout());
		
		
		botonesfila2= new ArrayList<JButton> ();
		
	
		
		for(int numeros=7;numeros<10;numeros++) {
			botonesfila2.add(new JButton(Integer.toString(numeros)));
		}
		botonesfila2.add(new JButton("+"));
		
		for(JButton b:botonesfila2) {
			fila2.add(b);
		}
		
		
		this.getContentPane().add(fila2);
		
		//fila3
		JPanel fila3 = new JPanel(new FlowLayout());
				
		botonesfila3= new ArrayList<JButton> ();
				
			
				
		for(int numeros=4;numeros<7;numeros++) {
			botonesfila3.add(new JButton(Integer.toString(numeros)));
		}
		botonesfila3.add(new JButton("-"));
				
		for(JButton b:botonesfila3) {
			fila3.add(b);
		}
				
		this.getContentPane().add(fila3);
		
		//fila4
		
		JPanel fila4 = new JPanel(new FlowLayout());
		
		botonesfila4= new ArrayList<JButton> ();
				
			
				
		for(int numeros=1;numeros<4;numeros++) {
			botonesfila4.add(new JButton(Integer.toString(numeros)));
		}
		botonesfila4.add(new JButton("%"));
				
		for(JButton b:botonesfila4) {
			fila4.add(b);
		}
				
		this.getContentPane().add(fila4);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ventana();
	}

}
