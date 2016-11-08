/*
 * Calcular la media e imprimir
 */

import java.util.Scanner;

public class t3ejer7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n,max,min,suma=0,i=0;
		float media=0f;
		System.out.print("Introduce un número: ");
		n=teclado.nextInt();
		max=n;
		min=n;
		
		while (n != 0){
			suma = suma +n;
			i++;
			if(n > max)
				max = n;
			if(n < min)
				min = n;
			
			System.out.print("Introduce un número: ");
			n=teclado.nextInt();
		}//fin while
		media = suma/i;
		System.out.println("- La media es " + media);
		System.out.println("- El número máximo introducido es " + max);
		System.out.println("- El número mínimo introducido es " + min);
	}

}
