import java.util.Scanner;

public class t3ejer1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);				//Para que pida la variable por teclado

		int a,b,suma=0;											//Declaraci�n de variables
		System.out.print("Inserta el primer n�mero: ");			//Escribir por pantalla
		a=teclado.nextInt();									//Pedir el n�mero a por teclado
		System.out.print("Inserte el segundo n�mero: ");		//Escribir por pantalla
		b=teclado.nextInt();									//Pedir el n�mero b por teclado

		if (a<=b){												//Condici�n para que a no sea menor que b
			while(a+1<=b-1){									//Bucle para que lea desde a+1 hasta b-1
																//no incluir� a y b
				suma = suma + (a + 1);							//contador de suma
				a++;											//Incremeto de a

			}
			System.out.println("La suma de n�meros entre a y b es: " + suma);		//Mostrar por pantalla el resultado 

		}
		else	
			System.out.println("Los n�meros son incorrectos");			//Mostrar por pantalla si los datos son incorrectos
}
}

