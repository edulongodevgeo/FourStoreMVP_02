package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class ProductController {
	String result = null;
	ProductService service = new ProductService();
	
	
	public String addProduct(String sku, Double price, Integer qtt) {
		Product product = new Product(sku, price, qtt);
		
		if(product.getSku().length() < 12 || product.getSku().length() > 12) {
			return "ERRO, ESSE SKU N�O EST� NO PADR�O DE 12 D�GITOS";
		}
		
		if(service.callCreate(product)) {
			if(product.getDepartment() != null || product.getSize() != null || product.getType() != null || product.getColor() != null || product.getCategory() != null) {
				result = "Cadastro realizado com sucesso."
						+ "\n Produto SKU: "+product.getSku()
						+ "\n Pre�o: "+product.getPrice()
						+ "\n Quantidade no estoque: "+product.getQtt()
						+ "\n Tipo: "+product.getType().getDescription()
						+ "\n Tamanho: "+product.getSize().getDescription()
						+ "\n Cor: "+product.getColor().getDescription()
						+ "\n Categoria: "+product.getCategory().getDescription()
						+ "\n Departamento: "+product.getDepartment().getDescription2();
			} else {
				result = "ERRO, ESSE SKU N�O FOI POSSIVEL CADASTRAR";
			}
		}else {
			result = "N�o foi poss�vel cadastrar o produto. Produto j� cadastrado.";
		}
		return result;
	}
	
	public String callAdd(String sku, Integer qtt) {
		
		Product product = new Product(sku, qtt);
		if(service.callAdd(product)) {
			result = "Estoque ampliado com sucesso!";
		}else {
			result = "Opera��o inv�lida. Tente novamente...";
		}
		return result;
	}
	
	public String callRemove(String sku, Integer qtt) {
		Product product = new Product(sku, qtt);
		if(service.callRemove(product)) {
			result = "Estoque removido com sucesso!";
		}else {
			result = "Opera��o n�o foi um sucesso.";
		}
		return result;
	}
	
	public String callListAll() {
		result = "";
		result = service.callListAll();
		if(result.equals("")) {
			result = "N�o existe nenhum produto cadastrado";
			return result;
		}
		return result;
	}

}
