package kodlamaio.norhtwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.norhtwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
