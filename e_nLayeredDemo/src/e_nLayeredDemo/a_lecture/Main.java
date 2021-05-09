package e_nLayeredDemo.a_lecture;

import e_nLayeredDemo.a_lecture.business.abstracts.ProductService;
import e_nLayeredDemo.a_lecture.business.concretes.ProductManager;
import e_nLayeredDemo.a_lecture.core.JLoggerManagerAdapter;
import e_nLayeredDemo.a_lecture.dataAccess.concretes.AbcProductDao;
import e_nLayeredDemo.a_lecture.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// Projede entityler haric new'lemek ilerde problem yaratir.

		// ToDo: Spring IoC ile cozulecek.
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter()); // Normalde burasi bile kotu kod. IoC ile cozulecek.
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);

	}

}
