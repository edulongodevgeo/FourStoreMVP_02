package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentEnum {
	
	MONEY("À vista dinheiro"),
	DEBITCARD("À vista debito"),
	CREDITCARD("Crédito"),
	PIX("Pix");
	
	private String description;
	
	PaymentEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	

}
