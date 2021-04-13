package gestion;

import java.util.ArrayList;

import gestion.Zoologico;
import zooAnimales.*;

public class Zona {
	private String nombre;
	//private Zoologico zoo[];
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private Animal animales[];
	
	//constructor
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		//this.zoo[0] = zoo;
		this.zoo.add(zoo);
	}
	
	
	public Zona(){
		
	}
	
	public Animal[] getAnimales() {
		return animales;
	}
	
	
	public int cantidadAnimales(){
		int totalanimales = this.animales.length;
		return totalanimales;	
		
	}
	
	
	public void agregarAnimales(Animal a) {
		int longitud = this.animales.length;
		this.animales[longitud+1] = a;
	}
	


	

	public String getNombre() {
		return this.nombre;
	}
	
	public Zoologico getZoo() {
		return this.zoo.get(0);
		
	}

}
