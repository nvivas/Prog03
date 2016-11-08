import java.util.Scanner;

public class t3ejer10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		int n,i,p=0,j,num;
		System.out.print("Introduce un número: ");
		n=teclado.nextInt();
		num = n;

		while(p == 0){
			j = 0;
			
			for(i=1;i<=n;i++){
				
				if(n % i == 0){
					j++;
				}

			}// fin for
			if(j == 2){
				System.out.println("El primo por exceso de " + num + " es " + n);
				p = 1;

			}// fin while
			n = n + 1;
		}
	}
}
