package Ejercicios;

public class TestTrabajador {

	public static void main(String[] args) {

		Trabajador o = new oficial("Luis", "Usero Reyes","Teniente");
		Trabajador t = new Tecnico("Nerea", "Bustos Lopez", true);
		
		System.out.println("Oficial con nombre: "+o+" Con sueldo mensual " +o.sueldoMensual(30));
		System.out.println("Tecnico con nombre: "+t+" Con sueldo mensual " +o.sueldoMensual(29));
	}

}
