/*
 * Calcular el area del Triángulo, del Cuadrado y del Rectángulo.
 */


import java.util.Scanner;

public class t3ejer12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n,z=0;
		float b,h,area;

		System.out.println("Elige una opción (1-3): ");
		System.out.println("- 1. Triángulo");
		System.out.println("- 2. Cuadrado");
		System.out.println("- 3. Rectángulo");

		while (z == 0){
			n = teclado.nextInt();
			switch(n){

			case 1:
				System.out.println("Introduce la base para calcular el área: ");
				b = teclado.nextFloat();
				System.out.println("Introduce la altura para calcular el área: ");
				h = teclado.nextFloat();
				area= (b*h)/2;
				System.out.println("El área del triángulo es " + area);
				z=1;
				break;

			case 2:
				System.out.println("Introduce un lado para calcular el área: ");
				b = teclado.nextFloat();
				area = b*b;
				System.out.println("El área del cuadrado es " + area);
				z=1;
				break;

			case 3:
				System.out.println("Introduce la base para calcular el área: ");
				b = teclado.nextFloat();
				System.out.println("Introduce la altura para calcular el área: ");
				h = teclado.nextFloat();
				area= b*h;
				System.out.println("El área del rectángulo es " + area);
				z=1;
				break;

			default:
				System.out.println("El número introducido no es valido");
				System.out.print("Elige una opción (1-3): ");
				break;

			}
		}
	}
}
