package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentEnum {
	
	MONEY("� vista dinheiro"),
	DEBITCARD("� vista debito"),
	CREDITCARD("Cr�dito"),
	PIX("Pix");
	
	private String description;
	
	PaymentEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	

}
