/**
 * 
 */
package es.maestredam.ejemplos;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author jmartinez
 *
 */
public class Ejemplo2App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Leyendo \"fichero.txt\"...");
		
		// Leo de "fichero.txt" el primer caracter y lo muestro
		try {	
			// 1. Creación (apertura)
		    FileReader fich = new FileReader("fichero.txt");	    
			// 2. Lectura
		    int car = fich.read();
			// 3. Cierre
			fich.close();
			
			// Lo muestro 
			System.out.printf("El primer caracter es %c%n", car);
			
		}catch (IOException ioe) {
			System.out.println("ERROR: "+ioe);
		}
		
		// Leo de "fichero.txt" el tercer caracter (solo el tercero)
		// y lo muestro
		try {	
			// 1. Creación (apertura)
		    FileReader fich = new FileReader("fichero.txt");	    
			// 2. Lectura
		    int car;
		    //car = fich.read();
		    //car = fich.read();
		    //car = fich.read();
		    
		    // Otra forma:
		    fich.skip(2);
		    car = fich.read();
		    
			// 3. Cierre
			fich.close();
			
			// Lo muestro 
			System.out.printf("El tercer caracter es %c%n", car);
			
		}catch (IOException ioe) {
			System.out.println("ERROR: "+ioe);
		}
		
		// Leo TODO el "fichero.txt" (lo muestro en consola)	
		try {	
			// 1. Creación (apertura)
		    FileReader fich = new FileReader("fichero.txt");	    
			// 2. Lectura
		    System.out.println("Contenido Completo:");
		    System.out.println("-------------------");
		    int car = fich.read();
		    while (car != -1) {
		    	System.out.printf("%c",car);
		    	car = fich.read();
		    }
		    System.out.println("-------------------");
		    
			// 3. Cierre
			fich.close();
			 
		}catch (IOException ioe) {
			System.out.println("ERROR: "+ioe);
		}
	}

}
