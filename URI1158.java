import java.util.Scanner;
public class URI1158 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int x,y,cont,N,cont2=0,impares=0,imp=0;
       
          N = entrada.nextInt();

        
          for (cont=1;cont<=N;cont++){
                x = entrada.nextInt();
                y = entrada.nextInt();
                while(imp < y){
                    if (x%2!=0){impares=x+impares;imp++;}
                    x++;
                }
                System.out.println(impares);
                impares=0;
                imp=0;
           }
           
    }
}
