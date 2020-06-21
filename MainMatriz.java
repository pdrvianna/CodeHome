import java.util.Locale;
import java.util.Scanner;

public class MainMatriz {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		
		int M, N, i, j, soma;
		

		System.out.print("Quantas linhas vai ter a matriz? "); 
		M = sc.nextInt();
		System.out.print("Quantas colunas vai ter a matriz? "); 
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		int[] vetsoma = new int[M];
		
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("\nMATRIZ DIGITADA:"); 
		soma = 0;
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.println(mat[i][j] + " ");
				soma = soma + mat[i][j];
			}		
		System.out.println();
		vetsoma[i] = soma;
		soma=0;
		}
		
		for (i = 0 ; i < M ; i++) {
			System.out.println("Soma da linha[" + (i+1) + "]: " + vetsoma[i]);
		}
		
		sc.close();

	}

}
