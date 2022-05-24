package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class ProductController {
	String result = null;
	ProductService service = new ProductService();
	
	
	public String addProduct(String sku,
							Double price, 
							Integer qtt, 
							String type,
							String size,
							String color,
							String category,
							String department) {
		Product product = new Product(sku, price, qtt, type, size, color, category, department);
		if(service.callCreate(product)) {
			result = "Cadastro realizado com sucesso."
					+ "\n Produto SKU: "+product.getSku()
					+ "\n Preço: "+product.getPrice()
					+ "\n Quantidade no estoque: "+product.getQtt()
					+ "\n Tipo: "+product.getType()
					+ "\n Tamanho: "+product.getSize()
					+ "\n Cor: "+product.getColor()
					+ "\n Categoria: "+product.getCategory()
					+ "\n Departamento: "+product.getDepartment();
		}else {
			result = "Não foi possível cadastrar o produto. Produto já cadastrado.";
		}
		return result;
	}
	
	public String callAdd(String sku, Integer qtt) {
		
		Product product = new Product(sku, qtt);
		if(service.callAdd(product)) {
			result = "Estoque ampliado com sucesso!";
		}else {
			result = "Operação não foi um sucesso.";
		}
		return result;
	}
	
	public String callRemove(String sku, Integer qtt) {
		Product product = new Product(sku, qtt);
		if(service.callRemove(product)) {
			result = "Estoque removido com sucesso!";
		}else {
			result = "Operação não foi um sucesso.";
		}
		return result;
	}
	
	public String callListAll() {
		result = "";
		result = service.callListAll();
		if(result.equals("")) {
			result = "Não existe nenhum produto cadastrado";
			return result;
		}
		return result;
	}

}
