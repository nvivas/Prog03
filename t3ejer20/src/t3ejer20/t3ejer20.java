package t3ejer20;

import java.util.Scanner;

public class t3ejer20 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n,i, fact;

		do{
			System.out.println("Introduce un número: ");
			n=teclado.nextInt();
			while (n < 0){
				System.out.println("Número erroneo. Introduce otro número: ");
				n=teclado.nextInt();
			}//fin while
			fact = 1;
			for(i=1;i <= n; i++){
				fact = fact * i;
			}
			System.out.println("El factorial del número es: " + fact);
		}while(n != 0);

	}

}
