/*
 * Introduce el nombre y la edad de 10 alumnos y decir cuántos son mayores de edad y quien es el mayor
 */
package t3ejer22;

import java.util.Scanner;

public class t3ejer22 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nombre, nuevoNombre = null;
		int edad=0, mayor=0, i, max=0;

		for(i = 1 ; i <= 3 ; i++ ){

			System.out.print("Introduce un nombre: ");
			nombre=teclado.next();
			System.out.print("Introduce la edad: ");
			edad=teclado.nextInt();	

			if(edad >= 18)
				mayor++;

			if(edad > max){
				max = edad;
				nuevoNombre = nombre;
			}
		}	
		System.out.println("Hay " + mayor + " mayores de edad");
		System.out.println("El mayor es " + nuevoNombre + " con " + max);
	}
}
