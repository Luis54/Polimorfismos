package Ejercicios;

public class Coche implements Vehiculo{
	
	int velocidad = 0;

	@Override
	public String acelerar(int valor) {
		// TODO Auto-generated method stub
		if(valor > VELOCIDAD_MAXIMA)
			return "EL coche Supera Maxima Velocidad ";
		else		
		return " Coche "+(this.velocidad+valor);
	}

	@Override
	public String frenar(int valor) {
		// TODO Auto-generated method stub
		return " Coche "+(this.velocidad-valor);
	}
	
	public int numeroPlazas() {
		return 5;
	}

}

