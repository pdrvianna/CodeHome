 
 import java.workbook;
 impor
 

public class ExcelLeitura {

    public static void main(String[] args) throws BiffException, IOException {
		
		Workbook workbook = Workbook.getWorkbook(new File("exemplo.xls"));

		Sheet sheet = workbook.getSheet(0);

		int linhas = sheet.getRows();
		int colunas = sheet.getColumns();
		String atual;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				Cell celula = sheet.getCell(j, i);
				atual = celula.getContents();
				System.out.println("Linha: "+i+" Coluna: "+j);
				if(atual == "nome"){
					Cell conteudo = sheet.getCell(j,i+1);
					System.out.println(conteudo.getContents());
				}
			}
		}
	}
}