package Ejercicios;

public abstract class Trabajador {

	private String nombre;
	private String apellido;
	
	public Trabajador(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	protected String nombreApellido(){
		return this.nombre+" "+this.apellido;
	}
	
	abstract double sueldoMensual(int diasTrabajados);

}
