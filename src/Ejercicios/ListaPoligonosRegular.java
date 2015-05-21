package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonosRegular {

	private List<PoligonoRegular> lista = new ArrayList<PoligonoRegular>();

	public ListaPoligonosRegular() {
		
	}
	
	public void añadirPoligono(PoligonoRegular p){
		lista.add(p); 
	}

	public List<PoligonoRegular> getLista() {
		return lista;
	}
	
	
	
}
