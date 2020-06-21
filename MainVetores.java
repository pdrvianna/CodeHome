import java.util.Locale;
import java.util.Scanner;

public class MainVetores {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int N, i;
		double soma;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (i = 0; i < N; i++) { 
			System.out.print("Digite um numero: "); 
			vet[i] = sc.nextDouble();
		}
		
		sc.close();
		
		System.out.println("\nNUMEROS DIGITADOS:"); 
		
		soma = 0;
		for (i = 0; i < N; i++) {
		System.out.println(String.format("%.1f", vet[i])); 
		soma = soma + vet[i];
		}
	
		System.out.printf("Soma dos numero: %.2f%n" , soma);
		System.out.println("Media: " + String.format("%.1f", soma/N));
		
		
		
	}

}
