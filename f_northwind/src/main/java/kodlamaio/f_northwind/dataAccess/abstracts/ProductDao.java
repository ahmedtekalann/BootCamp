package kodlamaio.f_northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.f_northwind.entities.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}
