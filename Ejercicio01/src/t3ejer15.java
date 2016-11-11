import java.util.Scanner;

public class t3ejer15 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Introduce un valor para a: ");
		a=teclado.nextInt();
		System.out.print("Introduce un valor para b: ");
		b=teclado.nextInt();
		System.out.print("Introduce un valor para c: ");
		c=teclado.nextInt();
		
		if(a>b && a>b && b>c)
			System.out.println(c + ", " + b + ", " + a);
			
		if (a>b && a>c && c>b)
			System.out.println(b + ", " + c + ", " + a);
		
		if (b>a && b>c && a>c)
			System.out.println(c + ", " + a + ", " + b);
		
		if (b>a && b>c && c>a)
			System.out.println(a + ", " + c + ", " + b);
		
		if (c>a && c>b && a>b)
			System.out.println(b + ", " + a + ", " + c);
		
		if (c>a && c>b && b>a)
			System.out.println(a + ", " + b + ", " + c);
					
		
	}

}
