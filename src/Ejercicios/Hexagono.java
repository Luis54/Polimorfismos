package Ejercicios;

public class Hexagono extends PoligonoRegular {

	public Hexagono(String nombrePoligo, int numeroLados, int longitudLado) {
		super(nombrePoligo, numeroLados, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double areaPoligono() {
		// TODO Auto-generated method stub
		return (perimetroPoligonoRegular()*Math.sqrt(Math.pow(getLongitudLado(), 2))-Math.pow(this.getLongitudLado()/2, 2))/2;
	}

}
