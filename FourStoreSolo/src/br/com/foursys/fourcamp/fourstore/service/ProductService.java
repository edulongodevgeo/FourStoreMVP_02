package br.com.foursys.fourcamp.fourstore.service;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductService {
	
	ProductData data = new ProductData();
	
	public boolean callCreate(Product product) {
		List lista  = new ArrayList<Product>();
		lista = data.listAll();
		Product produtoNew = product;
		for (int x = 0; x < lista.size(); x++) {
			Product produto = (Product) lista.get(x);
			if(produto.getSku().equals(produtoNew.getSku())) {
				return false;
			}
		}
		product.setId(data.listAll().size());
		data.save(product);
		return true;
	}
	
	public boolean callAdd (Product product) {
		if(data.updateAdd(product)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean callRemove (Product product) {
		if(data.updateRemove(product)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String callListAll() {
		String result = "";
		List lista  = new ArrayList<Product>();
		lista = data.listAll();
		if(lista.size()>0) {
			for (Object object : lista) {
				result+=object.toString();
			}
		}else {
			result = "";
		}
		return result;
	}
	
	public Double getPrice(Product product) {
		Double price = 0.0;
		List lista  = new ArrayList<Product>();
		lista = data.listAll();
		for (int x = 0; x < lista.size(); x++) {
			Product produto = (Product) lista.get(x);
			if(produto.getSku().equals(product.getSku())) {
				return produto.getPrice();
			}
		}
		return 0.0;

	}
	
	
}
