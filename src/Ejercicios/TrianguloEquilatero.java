package Ejercicios;


public class TrianguloEquilatero extends PoligonoRegular {

	public TrianguloEquilatero(String nombrePoligo, int numeroLados,
			double longitudLado) {
		super(nombrePoligo, numeroLados, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double areaPoligono() {
		// TODO Auto-generated method stub
		return Math.sqrt(3)*Math.pow(this.getLongitudLado(),2)/4;
	}

}
