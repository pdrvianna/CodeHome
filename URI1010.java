import java.util.Scanner;

	public class URI1010{

	 public static void main(String[] args) {
			
			Scanner entrada=new Scanner(System.in);
			
			int cod1, qtd1, cod2, qtd2;
			double valor1, valor2, valor;
			
			 cod1 = entrada.nextInt(); qtd1=entrada.nextInt();valor1=entrada.nextFloat(); 
			 cod2 = entrada.nextInt(); qtd2=entrada.nextInt();valor2=entrada.nextFloat(); 
			
			 //processar
			 
			 valor = valor1*qtd1 + valor2*qtd2;
			 
			 System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valor);
			 
			 entrada.close();
			
	}
}

