package e_nLayeredDemo.a_lecture.dataAccess.concretes;

import java.util.List;

import e_nLayeredDemo.a_lecture.dataAccess.abstracts.ProductDao;
import e_nLayeredDemo.a_lecture.entities.concretes.Product;

public class AbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Abc ile eklendi: "+product.getName());		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
