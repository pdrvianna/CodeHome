//package gomes.fernando.robson;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class ManipuladorArquivo {
 
    private String path;
    private String msg;
    
	
	public ManipuladorArquivo(String path, String msg) {
		this.path = path;
		this.msg = msg;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

    public static void leitor(String path) throws IOException {
        
		
    	BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        do {
        	linha = buffRead.readLine();
        	if (linha != null) {
               linha = linha + "\n";
               System.out.println(linha);
            } else {
        //    	System.out.println(linha);
            	buffRead.close();
            //	msg = linha;
            	//break;
            }
                
            
        }while (linha != null);
        
    }
 
    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
        in.close();
    }
 
}