import java.util.Scanner;

public class t3ejer18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n,i;
		float media=0,suma=0;

		System.out.print("Introduce un número: ");
		n=teclado.nextInt();

		for(i=1;i<=n;i++){
			suma = suma + i;
		}
		media = suma / n;
		System.out.println("La media de los números introducidos es " + media);
	}

}
