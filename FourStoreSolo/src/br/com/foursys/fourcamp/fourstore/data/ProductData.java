package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductData implements DataInterface {

	private static List<Product> lista = new ArrayList<Product>();
	
	@Override
	public void save(Product product) {
		lista.add(product);
	}

	@Override
	public boolean updateAdd(Product product) {
		Product produtoNew = product;
		for (int x = 0; x < lista.size(); x++) {
			Product produto = lista.get(x);
			if(produto.getSku().equals(produtoNew.getSku())) {
				produto.setQtt(produto.getQtt()+produtoNew.getQtt());
				lista.set(x, produto);
				return true;
			}
		}
		return false;
		
	}
	
	@Override
	public boolean updateRemove(Product product) {
		Product produtoNew =  product;
		for (int x = 0; x < lista.size(); x++) {
			Product produto =  lista.get(x);
			if(produto.getSku().equals(produtoNew.getSku())) {
				if(produto.getQtt()>=produtoNew.getQtt()) {
					produto.setQtt(produto.getQtt()-produtoNew.getQtt());
					lista.set(x, produto);
					return true;
				}
			}
		}
		return false;
		
	}


	@Override
	public List<Product> listAll() {
		return lista;
	}

	
	
}
