package Ejercicios;


public class TestVehiculo {
	
	public static void main(String[] args) {
		
		Vehiculo c = new Coche();
		Vehiculo m = new Motocicleta();
		
		System.out.println("Aceleracion  "+c.acelerar(130));
		System.out.println("Frenada " +c.frenar(5));
		System.out.println("Aceleracion " +m.acelerar(10));
		System.out.println("Frenada " +m.frenar(5));
		
		
	}

}
