package Ejercicios;

public class Cuadrado extends PoligonoRegular {
	
	public Cuadrado(String nombrePoligo, int numeroLados, double longitudLado) {
		super(nombrePoligo, numeroLados, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double areaPoligono() {
		// TODO Auto-generated method stub
		return this.getLongitudLado()*this.getLongitudLado();
	}

}
