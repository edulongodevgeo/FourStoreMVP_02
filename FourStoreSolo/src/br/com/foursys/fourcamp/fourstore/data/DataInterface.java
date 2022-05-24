package br.com.foursys.fourcamp.fourstore.data;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Product;

public interface DataInterface {
	public void save(Product product);
	public boolean updateAdd(Product product);
	public boolean updateRemove(Product product);
	public List<Product> listAll();
	
}
