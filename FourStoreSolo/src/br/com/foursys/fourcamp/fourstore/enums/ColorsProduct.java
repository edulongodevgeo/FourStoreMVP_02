package br.com.foursys.fourcamp.fourstore.enums;

public enum ColorsProduct {
	
	BLU("azul"),
	RED("vermelho"),
	GRE("verde"),
	WHI("branco"),
	BLA("preto"),
	YEL("amarelo"),
	BRO("marron"),
	GRA("cinza");
	
	private String description;

	private ColorsProduct(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
}
