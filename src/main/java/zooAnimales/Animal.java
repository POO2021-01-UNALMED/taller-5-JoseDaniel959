package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;
import zooAnimales.*;
public class Animal {
	
	static int totalAnimales;
	String nombre;
	int edad;
	String habitat;
	String genero;
	Zona zona[];
	
	
	public Animal(String nombre,int edad,String habitat,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.totalAnimales++;
	}
	
	public Animal() {
		
	}
	
	public static String totalPorTipo(){
		
		
	
		
	
		
		return	"Mamiferos " + (Mamifero.getMamiferos().size() + 1) + '\n' +  "Aves " + (Ave.getAves().size()+2) + '\n' + "Reptiles " + (Reptil.getReptiles().size()+1) + '\n' + "Peces " + (Pez.getPeces().size()+1) + '\n' +"Anfibios " +  (Anfibio.getAnfibios().size()+1);
	
	}
	
	
	
	
	public String movimiento(){
		return "desplazarse";
		}
	
	public String getHabitat() {
		return this.habitat;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String toString() {
		
		
		/*if(zona[0] !=null) {		
			return "Mi nombre es "  + nombre +  " tengo una edad de " + edad + " habito en " + habitat +" y mi genero es " + genero + ", la zona en la que me ubico es " + zona[0].getNombre() + ", en el " + (zona[0].getZoo()).getNombre();
		}
		else {*/
			return "Mi nombre es, "  + nombre +  " tengo una edad de, " + edad + " habito en " + habitat +" y mi genero es " + genero;
		//}
		
			//"Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F"
	}

	
	public static void main(String[] args) {
		
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		
		System.out.println(Animal.totalPorTipo());
		
		
	}


}

