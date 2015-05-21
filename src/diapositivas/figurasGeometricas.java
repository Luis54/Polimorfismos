package diapositivas;

public abstract class figurasGeometricas {
	private String nombre;

	public figurasGeometricas(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getArea();
}
class CirculoFiguras extends figurasGeometricas{
	
	private double radio;

	public CirculoFiguras(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.pow(radio, 2)*Math.PI;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", Nombre =" + getNombre() + "]";
	}
}
abstract class CuadrilateroFiguras extends figurasGeometricas{
	
	private double lado1;
	private double lado2;
	
	public CuadrilateroFiguras(String nombre, double lado1, double lado2) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}
	
		
}
class CuadradoFigura extends CuadrilateroFiguras{

	public CuadradoFigura(double lado) {
		super("Cuadrado", lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return Math.pow(getLado1(), 2);
	}

	@Override
	public String toString() {
		return "Cuadrado Lado =" + getLado1() + ", Nombre ="
				+ getNombre() + "]";
	}
}
class RectanguloFigura extends CuadrilateroFiguras{

	public RectanguloFigura(double lado1, double lado2) {
		super("Rectangulo", lado1, lado2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getLado1()*getLado2();
	}

	@Override
	public String toString() {
		return "RectanguloFigura [Lado1 =" + getLado1() + ", Lado2 ="
				+ getLado2() + ", Nombre =" + getNombre() + "]";
	}
	
	
}