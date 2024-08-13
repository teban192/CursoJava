import javax.swing.*;
public class Acceso_applicacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Esteban";
		String pass = "";
		
		while(!(pass.equals(clave))) {
			pass = JOptionPane.showInputDialog("ingresa la contrasena");
			if (clave.equals(pass) == false) {
				System.out.println("Contrasenna incorrecta");
			}
		}

	}

}
