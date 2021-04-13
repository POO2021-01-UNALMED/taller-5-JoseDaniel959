package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;
import gestion.Zoologico;

public class Anfibio extends Animal {
	//private Anfibio[] listado;
	private ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public  static int salamandras;
	public String colorPiel;
	private boolean venenoso;
	
	
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		//super(nombre,edad,habitat,genero);
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		super.totalAnimales++;
		
		//int longitud_Array = listado.length;
	
		//listado[longitud_Array] = new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso); 
	
		listado.add(new Anfibio(nombre, edad,habitat, genero, colorPiel, venenoso));
	
	}
	
	
	public Anfibio(){
		
		
		
	}
	
	
	
	public String movimiento(){
		return "saltar";
		
		
	}
	
	public Anfibio[] getAnfibios() {
		return listado;
	}


	public String getColorPiel() {
		return this.colorPiel;
	}


	public boolean isVenenoso() {
		return this.venenoso;
	}
	

	public static Animal crearRana(String nombre, int edad, String genero){
		ranas++;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		
		
	}

	
	public static Animal crearSalamandra(String nombre, int edad, String genero){
		salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,"negro",false);
		
		
	}


}

	