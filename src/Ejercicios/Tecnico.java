package Ejercicios;

public class Tecnico extends Trabajador{

	private final static double PAGA_DIARIA = 100;
	private boolean titulacionSuperior;
	
	public Tecnico(String nombre, String apellido,boolean titulacionSuperior) {
		super(nombre, apellido);
		this.titulacionSuperior = titulacionSuperior;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}

	@Override
	public String toString() {
		return nombreApellido()+" titulacionSuperior=" + titulacionSuperior;
	}

}
