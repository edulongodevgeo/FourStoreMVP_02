package br.com.foursys.fourcamp.fourstore.model;

import br.com.foursys.fourcamp.fourstore.enums.CategoryProduct;
import br.com.foursys.fourcamp.fourstore.enums.ColorsProduct;
import br.com.foursys.fourcamp.fourstore.enums.DepartmentEnum;
import br.com.foursys.fourcamp.fourstore.enums.Size;
import br.com.foursys.fourcamp.fourstore.enums.TypeProduct;

public class Product {
	private Integer id;
	private String sku;
	private Double price;
	private Integer qtt;
	private TypeProduct type;
	private Size size;
	private ColorsProduct color;
	private CategoryProduct category;
	private DepartmentEnum department;

	public Product(String sku, Double price, Integer qtt) {
		super();
		this.sku = sku;
		this.price = price;
		this.qtt = qtt;
		skuParse(sku);

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

	
	

	public TypeProduct getType() {
		return type;
	}

	public void setType(TypeProduct type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public ColorsProduct getColor() {
		return color;
	}

	public void setColor(ColorsProduct color) {
		this.color = color;
	}

	public CategoryProduct getCategory() {
		return category;
	}

	public void setCategory(CategoryProduct category) {
		this.category = category;
	}

	public DepartmentEnum getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEnum department) {
		this.department = department;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@Override
	public String toString() {
		return "Produto " + (id + 1) + " [sku=" + sku + ", qtt=" + qtt + ", type=" + type + "]\n";
	}

	private void skuParse(String skuToParse) {
        String size, category, type, department, color;
		
        try {
        	department = skuToParse.substring(0, 3);
    		category = skuToParse.substring(3, 4);
            type = skuToParse.substring(4,6);
            size = skuToParse.substring(6, 9);
            color = skuToParse.substring(9, 12);       
            
            DepartmentEnum departmentEnum = DepartmentEnum.valueOf(department);
            CategoryProduct categoryEnum = CategoryProduct.valueOf(category);
            TypeProduct typeEnum = TypeProduct.valueOf(type);
            Size sizeEnum = Size.valueOf(size);
            ColorsProduct colorEnum = ColorsProduct.valueOf(color);
                  
            this.size = sizeEnum;
            this.category = categoryEnum;
            this.type = typeEnum;
            this.department = departmentEnum;
            this.color = colorEnum;
		} catch (Exception e) {
			e.toString();
		}
        
        
    }
}
