package diapositivas;

public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura cir = new Circulo("Amarillo", 12);
		Figura cua = new Cuadrado("verde", 5);
		System.out.println(datosFigura(cir));
		System.out.println(datosFigura(cua));
	}
	public static String datosFigura(Figura f){
		return f+" y su area es "+f.getArea();
	}

}
class Figura{
	private String color;
	
	
	public Figura(String color) {
		this.color = color;
	}

	

	public String getColor() {
		return color;
	}

	

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	
	//esto es mejor hacerlo con interfaces o clases abstractas
	//definimo un metodo llamado getArea
	public double getArea(){
		return 0;
	}
}
class Circulo extends Figura{
	
	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + " color: "+getColor()+"]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.round(Math.PI*Math.pow(this.radio, 2));
	}
	
}
class Cuadrilatero extends Figura{
	private double lado1;
	private double lado2;
	
	
	public Cuadrilatero(String color, double lado1, double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return "Cuadrilatero [lado1=" + lado1 + ", lado2=" + lado2 + " color: "+getColor()+" ]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.lado1*this.lado2;
	}
	
}
class Cuadrado extends Cuadrilatero{
	
	

	public Cuadrado(String color, double lado) {
		super(color, lado,lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cuadrado [" + super.toString() + "]";
	}
	
	
}