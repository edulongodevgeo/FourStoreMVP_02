package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {
    MONEY("Dinheiro à vista"),
    DEBITCARD("Cartão de Débito"),
    CREDITCARD("Cartão de Crédito"),
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