package poo;
import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Empleado empleado1= new Empleado("Paco Gomez",85000,1990,12,17); Empleado
		 * empleado2= new Empleado("Ana Lopez",95000,1995,06,02); Empleado empleado3=
		 * new Empleado("Maria Martin",105000,2002,03,15); empleado1.subeSueldo(5);
		 * empleado2.subeSueldo(5); empleado3.subeSueldo(5);
		 * System.out.println("Nombre:"+empleado1.dameNombre()+"Sueldo:"+empleado1.
		 * dameSueldo()+"Fecha de Alta"+empleado1.dameFechaContrato());
		 * System.out.println("Nombre:"+empleado2.dameNombre()+"Sueldo:"+empleado2.
		 * dameSueldo()+"Fecha de Alta"+empleado2.dameFechaContrato());
		 */
		
		
		Jefatura jefe_RRHH= new Jefatura("Juan",55000,2006,9,25);
		jefe_RRHH.estableIncentivo(2570);
		Empleado[] misEmpleados = new Empleado[6];
		String[] miarray=new String[4];
		misEmpleados[0] = new Empleado("Paco Gomez",85000,1990,12,17);
		misEmpleados[1] = new Empleado("Ana Lopez",95000,1995,06,02);
		misEmpleados[2] = new Empleado("Maria Martin",105000,2002,03,15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		misEmpleados[4] = jefe_RRHH;
		misEmpleados[5] = new Jefatura("Maria",95000,1999,5,26);
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		jefa_Finanzas.estableIncentivo(55000);
		/*
		 * for(int i =0;misEmpleados.length>i;i++) { misEmpleados[i].subeSueldo(5);
		 * 
		 * }
		 */
	    System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		/*
		 * for(int i =0;i<3;i++) { System.out.println("Nombre: " +
		 * misEmpleados[i].dameNombre() +"Sueldo: " +misEmpleados[i].dameSueldo()+
		 * "Fecha de Alta :" +misEmpleados[i].dameFechaContrato()); }
		 */
		
		Arrays.sort(misEmpleados);
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " +
					  e.dameNombre() +"Sueldo: " +e.dameSueldo()+
					 "Fecha de Alta :" +e.dameFechaContrato());
		}
		
	}

}

class Empleado implements Comparable{
	
	public Empleado(String nom,double sue,int agno,int mes,int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		altaContrato= calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		this(nom,30000,2000,01,01);
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	public double dameSueldo() {//getter
		return sueldo;
	}
	public Date dameFechaContrato() {//getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {//Setter
		double aumento = sueldo * porcentaje/100;
		sueldo +=aumento;
	}
	public int compareTo(Object miObjecto) {
		Empleado otroEmpleado =(Empleado) miObjecto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
		
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}

final class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sueldo,int agno,int mes,int dia) {
		super(nom,sueldo,agno,mes,dia);
	}
	public void estableIncentivo(double b) {
		incentivo =b;
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de :"+decision;
	}
	
	private double incentivo;
	private static int idSiguiente =0;
	private int id;
	
}

