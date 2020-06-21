import java.util.Scanner;

public class URI1009{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double salario, tlvendas, ganho;

        nome = entrada.nextLine();
        salario = entrada.nextFloat();
        tlvendas = entrada.nextFloat();
       
        ganho = salario + tlvendas * 0.15;

       
        System.out.printf("TOTAL = R$ %.2f\n",ganho);

    }
}