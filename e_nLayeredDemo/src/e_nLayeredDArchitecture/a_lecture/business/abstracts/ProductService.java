package e_nLayeredDArchitecture.a_lecture.business.abstracts;

import java.util.List;

import e_nLayeredDArchitecture.a_lecture.entities.concretes.Product;

public interface ProductService {
	
	void add(Product product);
	List<Product> getAll();

}
