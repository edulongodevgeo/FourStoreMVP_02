package br.com.foursys.fourcamp.fourstore.enums;

public enum TypeProduct {
	SU("VER�O"),
	WI("INVERNO"),
	AU("OUTONO"),
	SP("PRIMAVERA"),
	OT("OUTROS");

	private String description;

	TypeProduct(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	

}
