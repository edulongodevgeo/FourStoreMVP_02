package br.com.foursys.fourcamp.fourstore.enums;

public enum DepartmentEnum {
	
	CLOTHING("vestu�rio"),
	SHOES("Cal�ados"),
	PERFUMERY("Perfumaria"),
	ACCESSORIES("Acessorios");

	private String description2;
	
	DepartmentEnum(String description2) {
		
		this.description2 = description2;
		
	}

	public String getDescription2() {
		return description2;
	}

}
