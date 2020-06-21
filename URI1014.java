import java.util.Scanner;

	public class URI1014{

	 public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		
		  int X;
		  double consumo,Y;
		  
		  X = entrada.nextInt();
		  Y = entrada.nextDouble();
		  
		  consumo = (double)X / Y;
		  
		  System.out.printf("%.3f km/l\n",consumo);
		
		entrada.close();
		
	}

}
