import java.util.Scanner;

public class t3ejer1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int a,b;
		int suma = 0;
		System.out.print("Inserta el primer n�mero: ");
		a=teclado.nextInt();
		System.out.print("Inserte el segundo n�mero: ");
		b=teclado.nextInt();

		if (a<=b){
			while(a+1<=b-1){

				suma = suma + (a + 1);
				a++;

			}
			System.out.println("La suma de n�meros entre a y b es: " + suma);

		}
		else	
			System.out.println("Los n�meros son incorrectos");
}
}

