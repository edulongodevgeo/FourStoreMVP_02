package br.com.foursys.fourcamp.fourstore.enums;

public enum CategoryProduct {
	
	M("MS - Masculino"),
	F("FM - Feminino"),
	B("BB - Baby"),
	O("OT - Outros");
	
	
	private String description;

	private CategoryProduct(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
