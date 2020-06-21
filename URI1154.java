import java.util.Scanner;
public class URI1154 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int N,soma=0,cont=0;
          float media;

          N = entrada.nextInt();
          while (N >=0) {
              soma=soma+N;
              cont++;
              N = entrada.nextInt();
              
          }
          media = (float)soma / cont;
          System.out.printf("%.2f\n",media);
    }
}
