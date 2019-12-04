package visao;

import model.AbstractDocument;
import model.CsvDocument;
import model.PdfDocument;

public class Teste {

	public static void main(String[] args) {
		AbstractDocument arq = new PdfDocument();
		
		System.out.println();
		
		AbstractDocument arq2 = new CsvDocument();

	}

}
