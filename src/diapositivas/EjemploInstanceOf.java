package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class EjemploInstanceOf {

	private static List<Persona> lista = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Profesor(35,"Juaquin","fisica y quimica");
		Persona p2 = new Profesor(25,"Juaquina","matematicas");
		Persona p3 = new Alumno(20, "Fernando","primero");
		Persona p4 = new Alumno(17, "Luisa","segundo");
		lista.add(p1);lista.add(p2);lista.add(p3);lista.add(p4);
		System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4);
		System.out.println(p1.getEdad()+"\n"+p2.getEdad()+"\n"+p3.getEdad()+"\n"+p4.getEdad());
		for (Persona persona : lista) {
			
			if(persona instanceof Profesor)
				System.out.println(((Profesor)persona).esMayorDeEdad());
			if(persona instanceof Alumno)
				System.out.println(((Alumno)persona).esMayorDeEdad());
		}

		
		
	}

}
class Persona{
	private int edad;
	private String nombre;
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	protected int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	protected String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
class Profesor extends Persona{
	
	private String asignatura;

	public Profesor(int edad, String nombre, String asignatura) {
		super(edad, nombre);
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", Edad ="
				+ getEdad() + ", Nombre =" + getNombre() + "]";
	}
	public boolean esMayorDeEdad(){
		return getEdad()>17;
	}
	
}
class Alumno extends Persona{
	
	private String curso;

	public Alumno(int edad, String nombre, String curso) {
		super(edad, nombre);
		this.curso = curso;
	}
	
	public boolean esMayorDeEdad(){
		return getEdad()>17;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", Edad =" + getEdad()
				+ ", Nombre =" + getNombre() + "]";
	}
	
	
}

