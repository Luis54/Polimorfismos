package Ejercicios;

import java.util.Arrays;

public class ArrayReales implements Estadisticas {
	
	private double[] valores;
	
	

	public ArrayReales(int tamano) {
		this.valores = new double[tamano];
		for (int i = 0; i < tamano; i++) {
			valores[i]=Math.random()*100;
		}
		Arrays.sort(valores);
	}

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		return this.valores[0];
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		return this.valores[this.valores.length-1];
	}

	@Override
	public double sumatorio() {
		int suma = 0;
		for (int i = 0; i < valores.length; i++) {
			suma+=valores[i];
		}
		return suma;
	}

	@Override
	public String toString() {
		return "ArrayReales [valores=" + Arrays.toString(valores) + "]";
	}
	
}
