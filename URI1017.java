import java.util.Scanner;
public class URI1017 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
		  int tempogasto, velocidade;
		  float consumo, distancia;
		  
		  tempogasto = entrada.nextInt();
		  velocidade = entrada.nextInt();
		
		  //processar
		  distancia = tempogasto * velocidade;
		  consumo = distancia / 12;
		  
		  //saida
		  System.out.printf("%.3f\n", consumo);
		  
		  entrada.close();

	}

}
