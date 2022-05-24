package br.com.foursys.fourcamp.fourstore.model;

public class Product {
	private Integer id;
	private String sku;
	private Double price;
	private Integer qtt;
	private String type;
	private String size;
	private String color;
	private String category;
	private String department;
	
	
	public Product( String sku, Double price, Integer qtt, String type, String size, String color,
			String category, String department) {
		super();
		this.sku = sku;
		this.price = price;
		this.qtt = qtt;
		this.type = type;
		this.size = size;
		this.color = color;
		this.category = category;
		this.department = department;
	}
	
	
	public Product(String sku, Integer qtt) {
		super();
		this.sku = sku;
		this.qtt = qtt;
	}



	public String getSku() {
		return sku;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQtt() {
		return qtt;
	}
	public void setQtt(Integer qtt) {
		this.qtt = qtt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Produto "+ (id+1) + " [sku=" + sku + ", qtt=" + qtt + ", type=" + type + "]\n";
	}
}
