/*
 * Calcular la media sumando los cuadrados de 1 a n
 */
package t3ejer19;

import java.util.Scanner;

public class t3ejer19 {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		int n,i;
		float media=0,suma=0;
		
		System.out.print("Introduce un número: ");
		n=teclado.nextInt();
		
		for(i=1;i<=n;i++)
			suma = (float)(suma + Math.pow(i,2));
		
		media = suma / n;
		System.out.println("La media del número introducido es " + media);
		
	}

}
