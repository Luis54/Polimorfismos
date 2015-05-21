package diapositivas3;

public interface Figure {
	
	//Definir una constante
	double NUMERO_PI = 3.1415;
	//compratamiento de los objetos:
	double getPerimetro();
	String getNombre();
	
	default String getTodo(){
		return getPerimetro()+" -- "+getNombre();
	}

}
