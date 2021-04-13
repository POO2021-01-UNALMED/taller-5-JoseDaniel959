package zooAnimales;

import gestion.Zona;

public class Pez extends Animal  {
	private Pez listado[];
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.listado =listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		super.totalAnimales++;
	
		
		
		int longitud_Array = listado.length;
		listado[longitud_Array] = new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas); 
		
		
	}
	
	public Pez(){
		
	}
	
	
	public String movimiento(){
		return "nadar";
		
		
	}
	
	
	public Pez[] getPeces() {
		return listado;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}

	public int getCantidadAletas() {
		return this.cantidadAletas;
	}

	public static Animal crearSalmon(String nombre, int edad, String genero){
		salmones++;
		return new Reptil(nombre,edad,"oceano",genero,"rojo",6);
		
		
	}


	public static Animal crearBacalao(String nombre, int edad, String genero){
		bacalaos++;
		return new Reptil(nombre,edad,"gris",genero,"rojo",6);
		
		
	}



}
