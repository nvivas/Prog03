import java.util.Scanner;

public class t3ejer11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i,j,n,z;
		System.out.print("Introduce un número: ");
		n = teclado.nextInt();

		System.out.print("Los números primos hasta " + n + " son: ");
		for (i=1;i<=n;i++){
			z=0;
			for(j=1;j<=i;j++){
				if(i%j == 0)
					z = z + 1;

			}
			if (z == 2)
				System.out.print(i + " ");
		}
	}

}
