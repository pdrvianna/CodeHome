import java.util.Scanner;

public class URI1048{

    public static void main (String args[]){

            Scanner entrada = new Scanner (System.in);

            float salario, reajuste = 0;
            String per = " ";
          

            salario = entrada.nextFloat();

            if (salario >= 0 && salario <= 400.00){
                reajuste = salario * 0.15f;
                salario = salario + reajuste;
                per = "15 %";
            }
            else if (salario > 400.00 && salario <= 800.00){
                reajuste = salario * 0.12f;
                salario = salario + reajuste;
                per = "12 %";
            }
            else if (salario > 800.00 && salario <= 1200.00){
                reajuste = salario * 0.10f;
                salario = salario + reajuste;
                per = "10 %";
            }
            else if (salario > 1200 && salario <= 2000.00){
                reajuste = salario * 0.07f;
                salario = salario + reajuste;
                per = "7 %";
            }
             else if (salario > 1200){
                reajuste = salario * 0.04f;
                salario = salario + reajuste;
                per = "4 %";
            }
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: " + per);
    }

}
