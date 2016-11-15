/*
 * Calcula la tabla de multiplicar (del 1 al 10) del número n introducido por teclado
 */
import java.util.Scanner;

public class t3ejer2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);									//Pide la variable por teclado
		int num=0,i;																//Declaración de variables
		System.out.print("Introduce un número del 1 al 100: ");						//Escribir por pantalla
		num=teclado.nextInt();														//Pedir el número a por teclado
		while(num < 1 || num > 100){												//Si es menor de 1 o mayor que 100 dará error
			System.out.print("Error. El número tiene que ser entre 1 y 100: ");
			num=teclado.nextInt();

		}
		System.out.println("TABLA DE MULTIPLICAR DE " + num);
		for(i=1;i<=10;i++){															//Bucle para sacar la tabla, los números y los resultados
			System.out.println(num + " * " + i + " = " + num*i);

		}



	}

}
