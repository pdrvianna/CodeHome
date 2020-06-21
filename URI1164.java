import java.util.Scanner;
public class URI1164 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
          int cont,N,numperfeito=1,s=0,num=1;

            N = entrada.nextInt();
            for (cont=0;cont<N;cont++){
                    numperfeito = entrada.nextInt();
                    while (num < numperfeito){
                        if (numperfeito % num==0){s=s+num;}
                        num++;
                    }
                    if (s == numperfeito){System.out.println(numperfeito+" eh perfeito");} else {System.out.println(numperfeito+ " nao eh perfeito");}
                    s=0;
                    num=1;
            }        
                    

    }
}
