package kodlamaio.norhtwind.business.abstracts;

import java.util.List;

import kodlamaio.norhtwind.core.utilities.results.DataResult;
import kodlamaio.norhtwind.core.utilities.results.Result;
import kodlamaio.norhtwind.entities.concretes.Product;

public interface ProductService {
	//List<Product> getAll(); old one
	DataResult<List<Product>> getAll(); // new one
	
	Result add(Product product);
}
