import java.util.Scanner;

public class t3ejer3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);							//Pide la variable por teclado
		int num,i;															//Declaraci�n de variables

		System.out.print("Introduce un n�mero: ");							//Escribir por pantalla
		num = teclado.nextInt();											//Pedir el n�mero a por teclado

		System.out.print("Los divisores del n�mero introducido son: ");		//Escribir por pantalla
		for(i=1;i <= num - 1;i++){											//Bucle para mostrar los divisores de num y que no muestre num
			if(num % i == 0)
				System.out.print(i + ", ");

		}

	}

}
