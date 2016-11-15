/*
 * Calcular el factorial de un número
 */

import java.util.Scanner;

public class t3ejer8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i,fact = 1,n;

		System.out.print("Introduce un número: ");
		n = teclado.nextInt();
		while(n <= 0){
			System.out.print("Número erroneo. Introduce otro número: ");
			n = teclado.nextInt();
		}// fin while
		
		for(i = n;i >= 1;i--)
			fact = fact * i;
		
		
		System.out.println("El factorial de " + n + " es " + fact);
	}

}
