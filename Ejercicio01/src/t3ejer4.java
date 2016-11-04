import java.util.Scanner;

public class t3ejer4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);							//Pide la variable por teclado
		int num,i;															//Declaración de variables

		System.out.print("Introduce un número: ");							//Escribir por pantalla
		num = teclado.nextInt();											//Pedir el número a por teclado
		System.out.print("El número introducido " + num + ":");
		
		for(i=1;i<=num;i++)	{												//Bucle para mostrar
			if(num % i == 0){
				if(num == i){
				System.out.println(" es primo");
				}else
					System.out.println(" no es primo");
			}	
		}		
	}

}
