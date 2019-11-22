package model;

public class PublicacaoXML implements Ponte{

	@Override
	public String criandoPublicacaoPonte(String string) {
		return (string + " - XML");
	}

}
