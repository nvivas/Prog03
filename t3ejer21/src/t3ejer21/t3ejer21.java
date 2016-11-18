/*
 * Introducir por teclado un caracter y un número, y se repite ese caracter n veces
 */
package t3ejer21;

import java.util.Scanner;

public class t3ejer21 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n = 0, i;
		String c;
		
		do{
		System.out.print("Introduce un caracter: ");
		c=teclado.next();
		System.out.print("Introduce el número de repeticiones: (0-80) ");
		n=teclado.nextInt();

		if(c.length() != 1)
			System.out.println("¡¡¡¡ERROR!!!! Solo se puede introducir un caracter.");
		if(n < 0 || n > 80)
			System.out.println("¡¡¡¡ERROR!!!! No se puede repetir más de 80 veces");
		
			}while (n < 0 || n > 80 || c.length() != 1);
		
		for(i=1; i<=n;i++){
			System.out.print(c);
		}
	}

}
