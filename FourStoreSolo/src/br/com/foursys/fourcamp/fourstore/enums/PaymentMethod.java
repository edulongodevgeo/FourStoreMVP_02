package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {
    MONEY("Dinheiro � vista"),
    DEBITCARD("Cart�o de D�bito"),
    CREDITCARD("Cart�o de Cr�dito"),
    PIX("Pix");
    
	private String description;
    PaymentMethod(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}