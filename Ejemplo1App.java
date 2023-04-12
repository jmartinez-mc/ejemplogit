package es.maestredam.ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejemplo1App {
    
	public static void main(String[] args) {
		System.out.println("Teclea una letra");
		
		// Lectura de un caracter por teclado
		
		try {
			// 1. Crear objeto (abrir stream para lectura por teclado)
			InputStreamReader teclado = 
					new InputStreamReader(System.in);
			
			// 2. Leo un caracter
			int car = teclado.read();
			
			// 3. Cierro el stream
			teclado.close();
		
			System.out.printf("Has tecleado %c%n",car);
			
		} catch (IOException ioe) {
			
			System.out.println("ERROR E/S: " + ioe);
		}
		
		// Escritura de varios caracteres en consola
		
		try {
			// 1. Crear objeto (abrir stream para escritura en consola)
			//OutputStreamWriter consola = 
					//new OutputStreamWriter(System.out);

			// Ahora en Fichero
			FileWriter consola = 
			             new FileWriter("fichero.txt");

			
			// 2. Escribo varios caracteres
			
			consola.write('H');
			consola.write('-');
			consola.write('I');
			consola.write('-');
			consola.write('J');
			consola.write('-');
			consola.write('K');
			consola.write('-');
			consola.write(13);   // salto de linea
			consola.write('\r');   // salto de linea
			consola.write("frase escrita de una vez \n");
			consola.write("otra frase \n");
			
			// 3. Cierro el stream
			consola.close();
			
		} catch (IOException ioe) {
			
			System.out.println("ERROR E/S: " + ioe);
		}
		

	}

}
