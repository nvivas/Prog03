/*
 * Calcular si los número son perfectos
 * Un número es perfecto si la suma de sus divisores es igual a dicho número
 */

import java.util.Scanner;

public class t3ejer9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n,i,suma = 0;

		System.out.print("Introduce un número: ");
		n = teclado.nextInt();

		for(i=1;i<n;i++)

			if(n%i == 0)
				suma = suma + i;

			if (suma == n)
				System.out.println("El número " + n + " es perfecto");
			else
				System.out.println("El número " + n + " no es perfecto");
	}

}
