package Ejercicios;

public class oficial extends Trabajador {
	
	private final static double PAGA_DIARIA = 100;
	private String clase;

	public oficial(String nombre, String apellido,String clase) {
		super(nombre, apellido);
		this.clase = clase;
		
	}
	
	
	public String getClase() {
		return clase;
	}
	 

	double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}


	@Override
	public String toString() {
		return nombreApellido()+ " clase: " + clase;
	}
	
	
	
}
