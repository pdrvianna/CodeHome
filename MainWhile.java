import java.util.Locale;
import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		int x, soma;
		soma = 0;
		
		System.out.print("Digite o primeiro numero: "); x = sc.nextInt();
		
		while (x != 0) {
		soma = soma + x;
		System.out.print("Digite outro numero: ");
		x = sc.nextInt();
		}
		
		System.out.println("SOMA = " + soma);
	
		sc.close();

	}

}
