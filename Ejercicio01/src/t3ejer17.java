
public class t3ejer17 {

	public static void main(String[] args) {
		
		int i;
		float media=0f,j,suma;
		
		j=0;
		suma=0;
		
		for(i=10;i<=15;i++){
			suma = suma + i;
			j = j+1;
			
		}
		media = suma / j;
		System.out.println("La media entre los número 10 y 15 es " + media);
		
	}

}
