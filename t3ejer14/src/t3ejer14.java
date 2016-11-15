/*
 * Saca el número invertido al introducido
 */


import java.util.Scanner;

public class t3ejer14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Introduce un número de 3 cifras: ");
		n=teclado.nextInt();
		
		while(n > 1000 || n < 100){
			System.out.print("Número erroneo. Introduce un número de 3 cifras: ");
			n=teclado.nextInt();
		}
		while(n != 0){
			i = n % 10;
			System.out.print(i);
			n=n/10;
		}
			
		

	}

}
