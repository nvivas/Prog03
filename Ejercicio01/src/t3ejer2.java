import java.util.Scanner;

public class t3ejer2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);									//Pide la variable por teclado
		int num=0,i;																//Declaraci�n de variables
		System.out.print("Introduce un n�mero del 1 al 100: ");						//Escribir por pantalla
		num=teclado.nextInt();														//Pedir el n�mero a por teclado
		while(num < 1 || num > 100){												//Si es menor de 1 o mayor que 100 dar� error
			System.out.print("Error. El n�mero tiene que ser entre 1 y 100: ");
			num=teclado.nextInt();

		}
		System.out.println("TABLA DE MULTIPLICAR DE " + num);
		for(i=1;i<=10;i++){															//Bucle para sacar la tabla, los n�meros y los resultados
			System.out.println(num + " * " + i + " = " + num*i);

		}



	}

}
