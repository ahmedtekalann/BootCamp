package b_oopIntro.a_lecture;

public class Main {

	public static void main(String[] args) {
		
		/*Product product = new Product();
		product.getId();*/
		
		Category category1 = new Category();
		/*category1.id = 1;
		category1.name = "Bilgisayar";*/
		category1.setId(1);
		category1.setName("Bilgisayar");
		System.out.println(category1.getId()+" "+category1.getName());
		

		Category category2 = new Category();
		/*category2.id = 2;
		category2.name = "Ev/Bahçe";*/
		category2.setId(2);
		category2.setName("Telefon");
		System.out.println(category2.getId()+" "+category2.getName());
		

		ProductManager productManager = new ProductManager();
		productManager.addToCart(productManager.product);
		//productManager.addToCart(productManager.product1);
		System.out.println("------");
		productManager.ListTheProducts();

		productManager.numberOfProducts();
		
		

	}

}
