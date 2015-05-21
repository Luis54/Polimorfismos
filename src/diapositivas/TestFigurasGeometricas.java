package diapositivas;


public class TestFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		figurasGeometricas f1 = new CuadradoFigura(5);
		figurasGeometricas f2 = new RectanguloFigura(5, 6);
		figurasGeometricas f3 = new CirculoFiguras(5);
		System.out.println(f1+"\n"+f2+"\n"+f3);
		System.out.println(f1.getArea()+"\n"+f2.getArea()+"\n"+f3.getArea());
	}

}
