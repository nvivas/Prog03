/*
 * Calcular el area del Tri�ngulo, del Cuadrado y del Rect�ngulo.
 */


import java.util.Scanner;

public class t3ejer12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n,z=0;
		float b,h,area;

		System.out.println("Elige una opci�n (1-3): ");
		System.out.println("- 1. Tri�ngulo");
		System.out.println("- 2. Cuadrado");
		System.out.println("- 3. Rect�ngulo");

		while (z == 0){
			n = teclado.nextInt();
			switch(n){

			case 1:
				System.out.println("Introduce la base para calcular el �rea: ");
				b = teclado.nextFloat();
				System.out.println("Introduce la altura para calcular el �rea: ");
				h = teclado.nextFloat();
				area= (b*h)/2;
				System.out.println("El �rea del tri�ngulo es " + area);
				z=1;
				break;

			case 2:
				System.out.println("Introduce un lado para calcular el �rea: ");
				b = teclado.nextFloat();
				area = b*b;
				System.out.println("El �rea del cuadrado es " + area);
				z=1;
				break;

			case 3:
				System.out.println("Introduce la base para calcular el �rea: ");
				b = teclado.nextFloat();
				System.out.println("Introduce la altura para calcular el �rea: ");
				h = teclado.nextFloat();
				area= b*h;
				System.out.println("El �rea del rect�ngulo es " + area);
				z=1;
				break;

			default:
				System.out.println("El n�mero introducido no es valido");
				System.out.print("Elige una opci�n (1-3): ");
				break;

			}
		}
	}
}
