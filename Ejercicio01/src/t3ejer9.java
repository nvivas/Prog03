/*
 * Calcular si los n�mero son perfectos
 * Un n�mero es perfecto si la suma de sus divisores es igual a dicho n�mero
 */

import java.util.Scanner;

public class t3ejer9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n,i,suma = 0;

		System.out.print("Introduce un n�mero: ");
		n = teclado.nextInt();

		for(i=1;i<n;i++)

			if(n%i == 0)
				suma = suma + i;

			if (suma == n)
				System.out.println("El n�mero " + n + " es perfecto");
			else
				System.out.println("El n�mero " + n + " no es perfecto");
	}

}
