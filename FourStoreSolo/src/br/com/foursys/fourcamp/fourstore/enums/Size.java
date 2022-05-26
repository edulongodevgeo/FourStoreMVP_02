package br.com.foursys.fourcamp.fourstore.enums;

public enum Size {
	RN0("Rescem Nascido"), 
	PP0("Extra Pequeno"), 
	P00("Pequeno"), 
	M00("Médio"), 
	G00("Grande"), 
	GG0("GG"), 
	XG0("Extra Grande"),
	XXG("Extra Extra Grande");

	private String description;

	Size(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
