package model;

public abstract class AbstractDocument {
	
	public AbstractDocument(){
		templateMethod();
	}
	
	public final void templateMethod(){
		
		if (openDocument() == true){
			extractRawData();
			parseRawData();
			closeDocument();
			analyzeData();
		}
	}
	
	public boolean openDocument(){
		System.out.println("Abriu o documento");
		return true;
	}
	public void extractRawData(){
		System.out.println("Extraiu linha de dados do documento");
	}
	
	public void parseRawData(){
		System.out.println("Leu a linha de dados do documento");
	}
	
	public abstract void analyzeData();
	
	public abstract void closeDocument();
}
