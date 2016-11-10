/*
 * Sacar raiz cuadrada de los números introducidos
 */
import java.util.Scanner;

public class t3ejer13 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner (System.in);

		float a,b,c,x,y,raiz,elevado;

		System.out.print("Introduce un valor para a: ");
		a=teclado.nextFloat();
		System.out.print("Introduce un valor para b: ");
		b=teclado.nextFloat();
		System.out.print("Introduce un valor para c: ");
		c=teclado.nextFloat();

		elevado = (float)Math.pow(b, 2);
		raiz = (float)Math.sqrt(elevado - 4*a*c);
		
		x = (-b + raiz)/(2*a);
		y = (-b - raiz)/(2*a);
		
		System.out.println("La solución de la raiz cuadrada es: " + x + " y " + y);


	}

}
