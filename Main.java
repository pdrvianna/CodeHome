
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		
			String nome1 , nome2;
			double salario1, salario2;
			int idade;
			char sexo;
	
			System.out.println("Digite o nome da primeira pessoa:");
			nome1 = sc.nextLine();
			System.out.println("Digite o salario da primeira pessoa:");
			salario1 = sc.nextDouble();
			
			System.out.println("Digitie o nome da segunda pessoa");
			sc.nextLine();
			nome2 = sc.nextLine();
			System.out.println("Digite o salario da segunda pessoa:");
			salario2 = sc.nextDouble();
			
			System.out.println("Digite a idade:");
			idade = sc.nextInt();
			System.out.println("Digite o sexo F/M :");
			sexo = sc.next().charAt(0);
			
			System.out.println("Nome 1: " + nome1);
			System.out.println("Salario 1: " + String.format("%.2f", salario1)); System.out.println("Nome 2: " + nome2);
			System.out.println("Salario 2: " + String.format("%.2f", salario2)); System.out.println("Idade: " + idade);
			System.out.println("Sexo: " + sexo);
					
			System.out.printf("Renda familiar: %.2f%n" , (salario1 + salario2));
			System.out.printf("Media salarial: %.2f%n" , (salario1 + salario2)/2);
			
			// System.out.printf("Equivalente em Fahrenheit: %.2f%n", F); 
			
			sc.close();
			
	
			
	}

}
