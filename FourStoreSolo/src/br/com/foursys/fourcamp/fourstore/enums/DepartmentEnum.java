package br.com.foursys.fourcamp.fourstore.enums;

public enum DepartmentEnum {
	
	CLO("vestu�rio"),
	SHO("Cal�ados"),
	PER("Perfumaria"),
	ACC("Acessorios");

	private String description2;
	
	DepartmentEnum(String description2) {
		
		this.description2 = description2;
		
	}

	public String getDescription2() {
		return description2;
	}

}
