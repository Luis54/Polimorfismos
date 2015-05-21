package diapositivas3;

import java.util.ArrayList;
import java.util.List;



public class TestFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos objetos
		Figure f1 = new TrianguloEquilateroFigure(5);
		Figure f2 = new TrianguloIsosceles(3,4);
		Figure f3 = new ElipseFigure(3, 4);
		Figure f4 = new CircunferecniaFigure(3);
		List<Figure> lista = new ArrayList<Figure>();
		lista.add(f1);lista.add(f2);lista.add(f3);lista.add(f4);
		//Recorremos la coleccion y mostramos el nombre y el perimetro
		for (Figure figure : lista) {
			System.out.println(figure.getNombre()+" -- "+figure.getPerimetro());
			System.out.println("-------------------------------------");
			System.out.println(figure.getTodo());
			
		}
		//¿Se puede crear objetos de tipo Figure? (usando new Figure)
		
		//Figure f5 = new Figure // si como objeto de clase anonima
		//¿Y de CircularFigure?
		
		//CircularFigure f5 = new CircularFigure() //ocurre igual 
	}

}
