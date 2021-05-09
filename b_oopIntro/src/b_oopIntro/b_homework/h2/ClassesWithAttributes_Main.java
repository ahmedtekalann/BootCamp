package b_oopIntro.b_homework.h2;

public class ClassesWithAttributes_Main {

	public static void main(String[] args) {
		Product product = new Product();
		// product.name="Laptop"; //Ayrica bu bilgiler gercek hayatta veritabaninda
		// tutulur
		// biz bunlari design ederken textbox vs gibi componentler'de ediyoruz ve bu
		// ozellik-
		// leri kullanici giriyor, biz girilen bu alanlari veritabanindan cekiyoruz.

		product.set_name("Laptop");
		// product.id=1; //bunun yerine
		product.setId(1); // bu oldu encapsulation sayesinde
		// product.description="Asus Laptop";
		product.set_description("Asus Laptop");
		// product.price=500;
		product.set_price(50);
		// product.stockAmount=3;
		product.set_stockAmount(0);
		System.out.println(product.get_name());

		ProductManager productManager = new ProductManager();
		productManager.Addition(product);

		System.out.println(product.get_kod());

		Product product2 = new Product(2, "Telephone", "Iphone", 50, 2500, "White");
		productManager.Addition(product2);

		System.out.println(product2.get_kod());

	}

}
