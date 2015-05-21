package Ejercicios;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PoligonoRegular t1 = new TrianguloEquilatero("Triangulo Equilatero 1", 3, 3);
		
		PoligonoRegular c1 = new Cuadrado("Cuadrado 1",4,3);
		
		PoligonoRegular h1 = new Hexagono("Hexagono 1", 6, 3); 
	
		ListaPoligonosRegular l = new ListaPoligonosRegular();
		
		l.añadirPoligono(t1);l.añadirPoligono(c1);l.añadirPoligono(h1);
		
		for (PoligonoRegular poligonoRegular : l.getLista()) {
			System.out.println(poligonoRegular+" area: "+poligonoRegular.areaPoligono()+ " perimetro: "+
					poligonoRegular.perimetroPoligonoRegular());
		}
		
		

	}

}
