import java.util.*;
import javax.swing.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* Scanner entrada = new Scanner(System.in);
      System.out.println("Introduce tu nombre; por favor");
      String nombre_usuario = entrada.nextLine();
      System.out.println("Introduce edad; por favor");
      int edad = entrada.nextInt();
      System.out.println("Hola"+nombre_usuario+".el anno que viene tendras"+(edad+1));*/
		
		String num1= JOptionPane.showInputDialog("Introduce un numero");
		double num2 = Double.parseDouble(num1);
		System.out.print("La raiz de "+num2+" es ");
		System.out.printf("%1.4f",Math.sqrt(num2));
		
	}

}
