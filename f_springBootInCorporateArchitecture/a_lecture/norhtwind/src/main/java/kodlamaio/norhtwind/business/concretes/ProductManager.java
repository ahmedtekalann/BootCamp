package kodlamaio.norhtwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.norhtwind.business.abstracts.ProductService;
import kodlamaio.norhtwind.core.utilities.results.DataResult;
import kodlamaio.norhtwind.core.utilities.results.Result;
import kodlamaio.norhtwind.core.utilities.results.SuccessDataResult;
import kodlamaio.norhtwind.core.utilities.results.SuccessResult;
import kodlamaio.norhtwind.dataAccess.abstracts.ProductDao;
import kodlamaio.norhtwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	//public List<Product> getAll() { old one
	public DataResult<List<Product>> getAll(){
		
		// return this.productDao.findAll(); old one return
		
		return	new SuccessDataResult<List<Product>>(this.productDao.findAll(),
				"Data was listed.") ;
				
		
	}

	@Override
	public Result add(Product product) {
		//save methoduyla ekleme ve guncellemeler hizlica yapilabilir.
		this.productDao.save(product);
		return new SuccessResult("Product was added.");
	}

}
