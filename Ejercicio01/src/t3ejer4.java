/*
 * Programa para decir si el número introducido por teclado es primo o no
 */
import java.util.Scanner;

public class t3ejer4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);							//Pide la variable por teclado
		int num,i,j=0;															//Declaración de variables

		System.out.print("Introduce un número: ");							//Escribir por pantalla
		num = teclado.nextInt();											//Pedir el número a por teclado

		for(i=2;i<=num;i++)	{												//Bucle para mostrar
			if(num % i == 0){
				j++;
			}	
		}	
		if(j==2)
			System.out.println("El número " + num + " es primo");
		else
			System.out.println("El número " + num + " no es primo");

	}

}
