/*
 * Programa que suma los número de las posiciones par e impar indepenc
 */

import java.util.Scanner;

public class t3ejer6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n,i=0,sump=0,sumi=0;

		System.out.print("Introduce un número: ");
		n=teclado.nextInt();

		while(n != 0){

			i++;
			if(i % 2 == 0)
				sump = sump + n;
			else
				sumi = sumi + n;
			System.out.print("Introduce un número: ");
			n=teclado.nextInt();
		}
		System.out.println("La suma de los número en posicion par es " + sump);
		System.out.println("La suma de los número en posicion impar es " + sumi);
	}

}
