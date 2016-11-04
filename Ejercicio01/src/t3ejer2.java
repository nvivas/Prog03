import java.util.Scanner;

public class t3ejer2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num=0,i;
		System.out.print("Introduce un número del 1 al 100: ");
		num=teclado.nextInt();
			while(num < 1 || num > 100){
				System.out.print("Error. El número tiene que ser entre 1 y 100: ");
				num=teclado.nextInt();
				
			}
			System.out.println("TABLA DE MULTIPLICAR DE " + num);
			for(i=1;i<=10;i++){
				System.out.println(num + " * " + i + " = " + num*i);
				
			}
	
	
	
	}

}
