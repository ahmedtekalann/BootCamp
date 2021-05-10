package kodlamaio.norhtwind.business.abstracts;

import java.util.List;

import kodlamaio.norhtwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
