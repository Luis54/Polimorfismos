package Ejercicios;

public class Motocicleta implements Vehiculo{

	int velocidad = 0;

	@Override
	public String acelerar(int valor) {
		// TODO Auto-generated method stub
				if(valor > VELOCIDAD_MAXIMA)
					return "La Moto Supera Maxima Velocidad ";
				else		
				return " Moto "+(velocidad+valor);
	}

	@Override
	public String frenar(int valor) {
		// TODO Auto-generated method stub
		return " Moto "+ (velocidad-valor);
	}

	public int numeroPlazas() {
		return 2;
	}

	
}
