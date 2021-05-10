package e_nLayeredDArchitecture.a_lecture.dataAccess.abstracts;

import java.util.List;

import e_nLayeredDArchitecture.a_lecture.entities.concretes.Product;

public interface ProductDao {
	//urun ekleme, guncelleme, silme vb. isler
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	Product get(int id);
	//Product[] getAll(); Bunun yerine ArrayList kullanacagiz. Cunku 
	 // Sadece dizi olusturursak yeni bir sey eklemek istedigimizde eger new'leyip
	 // eleman atadiysak siniri gecmis oluruz (index out of bounds exception).
	List<Product> getAll();//

}
