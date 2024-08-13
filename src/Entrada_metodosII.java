import javax.swing.*;
public class Entrada_metodosII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		System.out.println("Hola "+nombre_usuario+".El anno que vienes tendras "+ edad_usuario+ " annos");
	}

}
