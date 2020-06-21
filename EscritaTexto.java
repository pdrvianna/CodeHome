//package gomes.fernando.robson;
 
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;
 
public class EscritaTexto {
 
    public static void main(String args[]) throws IOException {
        
    	String path = "/Users/Pedro/ws_eclipse/TreinoJava/src/files.txt";
        String msg="";
        
        Scanner ent = new Scanner(System.in);
        
        String opcao;
        
     //   ManipuladorArquivo.escritor(path);
 
       // opcao = JOptionPane.showInputDialog("Deseja L-Ler ou E-Escrever [L/E]? ");
        
      //  opcao = ent.nextLine();
        
      //  if (opcao == "L") {
        	ManipuladorArquivo.leitor(path);
     //   }
        
       // JOptionPane.showMessageDialog(null, msg);
        
       // ManipuladorArquivo.escritor(path);
       // ManipuladorArquivo.leitor(path);
    }
 
}