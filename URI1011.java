import java.util.Scanner;

	public class URI1011{

	 public static void main(String[] args) {
			
			Scanner entrada=new Scanner(System.in);
			
			double pi,calculo,raio;
			
			raio = entrada.nextFloat();
			
			pi = 3.14159;
			
			//processar
			
			
			calculo = (4.0/3) * pi * raio * raio * raio;
			
			System.out.printf("VOLUME = %.3f\n", calculo);
			
			entrada.close();

	}

}
