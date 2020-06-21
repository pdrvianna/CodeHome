//package gomes.fernando.robson;
 
import java.io.IOException;
 
public class EscritaTexto {
 
    public static void main(String args[]) throws IOException {
        String path = "/Users/Pedro/ws_eclipse/TreinoJava/src/file.txt";
 
        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
 
}