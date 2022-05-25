package br.com.foursys.fourcamp.fourstore.enums;

public enum Size {
	RN("Rescem Nascido"), 
	PP("Extra Pequeno"), 
	P("Pequeno"), 
	M("Médio"), 
	G("Grande"), 
	GG("GG"), 
	XG("Extra Grande"),
	XXG("Extra Extra Grande");

	private String description;

	Size(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
