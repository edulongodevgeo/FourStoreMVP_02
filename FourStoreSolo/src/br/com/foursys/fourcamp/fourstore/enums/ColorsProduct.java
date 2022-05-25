package br.com.fourstore.enums;

public enum ColorsProduct {
	
	BLUE("azul"),
	RED("vermelho"),
	GREEN("verde"),
	WHITE("branco"),
	BLACK("preto"),
	YELLOW("amarelo"),
	BROWN("marron"),
	GRAY("cinza");
	
	private String description;

	private ColorsProduct(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
}
