package diapositivas3;


public abstract class CircularFigure implements Figure {
	
	private int semiejeMenor,semiEjeMayor;

	public CircularFigure(int semiejeMenor, int semiEjeMayor) {
		this.semiejeMenor = semiejeMenor;
		this.semiEjeMayor = semiEjeMayor;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*NUMERO_PI*Math.sqrt(this.semiEjeMayor*this.semiejeMenor+this.semiejeMenor*this.semiejeMenor)/2;
	}

	

}
