import java.util.Scanner;
public class URI1046 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
		  int horaini, horafinal, duracao;

          horaini = entrada.nextInt();
          horafinal = entrada.nextInt();
          duracao = 0;

		  if (horaini < horafinal){
              duracao = horafinal - horaini;
          } else if (horaini >= horafinal){
              duracao = (24 - horaini) + horafinal;
          }

          System.out.println("O JOGO DUROU "+duracao+" HORA(S)");

    }
}
