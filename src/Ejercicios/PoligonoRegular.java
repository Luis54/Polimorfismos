package Ejercicios;

public abstract class PoligonoRegular implements Comparable<PoligonoRegular>{
	
	private String nombrePoligo;
	private int numeroLados;
	private double longitudLado;
	
	public PoligonoRegular(String nombrePoligo, int numeroLados,
			double longitudLado) {
		this.nombrePoligo = nombrePoligo;
		this.numeroLados = numeroLados;
		this.longitudLado = longitudLado;
	}
	
	public double perimetroPoligonoRegular(){
		return numeroLados*longitudLado;
		
	}
	
	
	public abstract double areaPoligono();

	@Override
	public String toString() {
		return "PoligonoRegular [nombrePoligo=" + nombrePoligo
				+ ", longitudLado=" + longitudLado + "]";
	}
	
	
	public String getNombrePoligo() {
		return nombrePoligo;
	}

	

	public int getNumeroLados() {
		return numeroLados;
	}

	

	public double  getLongitudLado() {
		return longitudLado;
	}

	@Override
	public int compareTo(PoligonoRegular o) {
		return Math.abs(o.numeroLados-this.numeroLados);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(longitudLado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numeroLados;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Double.doubleToLongBits(longitudLado) != Double
				.doubleToLongBits(other.longitudLado))
			return false;
		if (numeroLados != other.numeroLados)
			return false;
		return true;
	}

	

}
