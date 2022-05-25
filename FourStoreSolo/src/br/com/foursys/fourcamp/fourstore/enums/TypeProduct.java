package br.com.foursys.fourcamp.fourstore.enums;

public enum TypeProduct {
	SUMMER("VERÃO"),
	WINTER("INVERNO"),
	AUTUMN("OUTONO"),
	SPRING("PRIMAVERA"),
	OTHERS("OUTROS");

	private String description;

	TypeProduct(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	

}
