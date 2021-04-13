package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal  {
	private Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	

	
	public Mamifero(){
		super(null,0,null,null);
		
		
	}
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		//super(nombre,edad,habitat,genero);
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.listado = listado;
		this.pelaje = pelaje;
		this.patas = patas;
		super.totalAnimales++;
		
		
		//int longitud_Array = listado.length;
		//listado[longitud_Array] = new Mamifero(nombre,edad,habitat,genero,pelaje,patas); 
	
	
	}
	
	public static Animal crearCaballo(String nombre, int edad, String genero){
		
		 caballos++;
		 return new  Mamifero(nombre,edad,"pradera",genero,true,4); 
		 
	}
	
	public static Animal crearLeon(String nombre, int edad, String genero){
		
		leones++;
		return new Mamifero(nombre,edad,"selva",genero,true,4); 
		
	}
	
	
	public Mamifero[] getMamiferos() {
		return listado;
	}

	public boolean isPelaje() {
		return this.pelaje;
	}

	public int getPatas() {
		return this.patas;
	}

}
