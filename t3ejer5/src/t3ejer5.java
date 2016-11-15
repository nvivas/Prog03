/*
 * Programa que suma los números y me imprime la suma y cuantos números hemos introducido hasta introducir el 0
 */
import java.util.Scanner;

public class t3ejer5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n,i=0,suma=0;

		System.out.print("Introduce un número: ");
		n=teclado.nextInt();

		while(n != 0){
			suma = suma + n;
			i++;
			System.out.print("Introduce un número: ");
			n=teclado.nextInt();

		}
		System.out.println("La suma de los números es " + suma);
		System.out.println("Los números introducidos son " + i);
	}

}
