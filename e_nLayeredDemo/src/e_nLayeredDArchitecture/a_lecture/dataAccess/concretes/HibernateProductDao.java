package e_nLayeredDArchitecture.a_lecture.dataAccess.concretes;

import java.util.List;

import e_nLayeredDArchitecture.a_lecture.dataAccess.abstracts.ProductDao;
import e_nLayeredDArchitecture.a_lecture.entities.concretes.Product;

//hibernate, veritabaniyla er�s�m kuran java yapisi
public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {		
		System.out.println("Hibernate ile eklendi: "+product.getName());
	}

	@Override
	public void update(Product product) {
		
		
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
	}//Product icin veri erisim 

}
