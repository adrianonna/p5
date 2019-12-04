package model;

public class CsvDocument extends PdfDocument{
	
	public CsvDocument(){}
	
	public boolean openDocument(){
		System.out.println("Abriu doc CSV");
		return true;
		//Aqui poderia retorna false tb - método gancho
	}
	
	public void analyzeData() {
		System.out.println("Analisa o documento CSV");
	}

	public void closeDocument() {
		System.out.println("Fecha o doc CSV");
	}
}
