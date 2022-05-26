package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class ProductController {
	String result = null;
	ProductService service = new ProductService();
	
	
	public String addProduct(String sku, Double price, Integer qtt) {
		Product product = new Product(sku, price, qtt);
		
		if(product.getSku().length() < 12 || product.getSku().length() > 12) {
			return "ERRO, ESSE SKU NÃO ESTÁ NO PADRÃO DE 12 DÍGITOS";
		}
		
		if(service.callCreate(product)) {
			result = "Cadastro realizado com sucesso."
					+ "\n Produto SKU: "+product.getSku()
					+ "\n Preço: "+product.getPrice()
					+ "\n Quantidade no estoque: "+product.getQtt()
					+ "\n Tipo: "+product.getType().getDescription()
					+ "\n Tamanho: "+product.getSize().getDescription()
					+ "\n Cor: "+product.getColor().getDescription()
					+ "\n Categoria: "+product.getCategory().getDescription()
					+ "\n Departamento: "+product.getDepartment().getDescription2();
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
			result = "Operação inválida. Tente novamente...";
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
