import java.util.Scanner;
public class URI1061{

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        int w, diafim, diainicio,H,M,S,tempo1,tempo2,duracao, resto;
        String texto;
        String[] palavras;
       // float teste;

        //dia inicial
        palavras = entrada.nextLine().split(" ");
        //palavras = texto.split(" ");
        diainicio= Integer.parseInt(palavras[1]);

        palavras = entrada.nextLine().split(":");
        //palavras = texto.split(" ");
        H = Integer.parseInt(palavras[0]);
        M = Integer.parseInt(palavras[1]);
        S = Integer.parseInt(palavras[2]);
        tempo1 = (diainicio * 24 * 3600) + (H * 3600) + (M *60) + S;


        //dia final
        texto = entrada.nextLine();
        palavras = texto.split(" ");
        diafim= Integer.parseInt(palavras[1]);
       

        palavras = entrada.nextLine().split(":");
        //palavras = texto.split(" ");
        H = Integer.parseInt(palavras[0]);
        M = Integer.parseInt(palavras[1]);
        S = Integer.parseInt(palavras[2]);
        tempo2 = (diafim * 24 * 3600) + (H * 3600) + (M *60) + S;

        duracao = tempo2 - tempo1;
        diafim = duracao / 24;
        resto = duracao % 24;
        H = resto / 3600;
        resto = resto % 3600;
        M = resto / 60;
        resto = resto % 60;
        S = resto / 60;

       // System.out.println("Palavra:"+texto);
        w = diafim - diainicio;
        System.out.println(diafim + " dia(s)");
        System.out.println(H + " hora(s)");
        System.out.println(M + " minuto(s)");
        System.out.println(S+ " segundo(s)");

        //teste = (float) Math.sqrt(81);
        //System.out.println(teste);
    }
}