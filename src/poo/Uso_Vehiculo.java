package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Coche micoche = new Coche ();
		 * micoche.esteblece_color(JOptionPane.showInputDialog("Introduce Color"));
		 * System.out.println(micoche.dime_color());
		 * System.out.println(micoche.dime_datos_generales());
		 * micoche.configura_asientos(JOptionPane.
		 * showInputDialog("Tiene asientos de cuero"));
		 * System.out.println(micoche.dime_asientos());
		 * micoche.configura_climatizador(JOptionPane.
		 * showInputDialog("Tiene climatizador"));
		 * System.out.println(micoche.dime_climatizador());
		 * System.out.println(micoche.dime_peso_coche());
		 * System.out.println("El precio final del coche es:"+micoche.precio_coche());
		 */
		
		Coche miCoche1 = new Coche();
		miCoche1.esteblece_color("Rojo");
		Furgoneta miFurgoneta1 = new Furgoneta(7,580);
		miFurgoneta1.esteblece_color("Azul");
		miFurgoneta1.configura_asientos("Si");
		miFurgoneta1.configura_climatizador("Si");
		
		System.out.println(miCoche1.dime_datos_generales() + " " +miCoche1.dime_color());
		System.out.println(miFurgoneta1.dime_datos_generales() + " "+ miFurgoneta1.dimeDatosFurgoneta());
		
		
	}

}
