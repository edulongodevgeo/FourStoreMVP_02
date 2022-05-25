package br.com.fourstore.enums;

public enum CategoryProduct {
	
	MALE("MS - Masculino"),
	FEMININE("FM - Feminino"),
	BABY("BB - Baby"),
	OTHERS("OT - Outros");
	
	
	private String description;

	private CategoryProduct(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
