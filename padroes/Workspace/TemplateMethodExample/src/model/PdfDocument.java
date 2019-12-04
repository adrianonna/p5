package model;

public class PdfDocument extends AbstractDocument{

	public PdfDocument(){}
	
	public boolean openDocument(){
		System.out.println("Abriu doc PDF");
		return true;
		//Aqui poderia retorna false tb - método gancho
	}
	
	public void analyzeData() {
		System.out.println("Analisa o documento PDF");
	}

	public void closeDocument() {
		System.out.println("Fecha o doc PDF");
	}
	
	

}
