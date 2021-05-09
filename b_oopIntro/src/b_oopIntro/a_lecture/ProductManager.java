package b_oopIntro.a_lecture;

public class ProductManager {
	// yazilan metotlar istedigimiz zaman istedigimiz yerde kullanmak ve kendimizi
	// tekrar etmemek için (do not repeat yourself DRY)

	Product product = new Product(1, "Lenovo V14", 150000, "16 GB",10/*,13500*/); //mantikli degil yazilabiliyo olmasi. bunun icin method yapmamiz gerekir.
																			//yazdigimiz degil okuyabildigimiz bi sey olmasi gerek
																			//bunu encapsulation'la cozmemiz gerek. getter setter
	
	/*Product product2 = new Product();
	product2.*/
	/*Product product1 = new Product(2, "Lenovo V15", 160000, "32 GB");
	Product product2 = new Product(3, "Hp 15", 150000, "8 GB");
	Product product3 = new Product(4, "Monster 9", 400000, "64 GB");*/
	

	
	Product[] products = { product/*, product1, product2, product3*/ };
	
	
	public void ListTheProducts() {
//		String name = product.name;
		String name = product.getName();
		//double unitPrice = product.unitPrice;
		double unitPrice = product.getUnitPrice();
//		String detail = product.detail;
		String detail = product.getDetail();
		for (Product productt : products) {
			//name = productt.name;
			name = productt.getName();
//			unitPrice = productt.unitPrice;
			unitPrice = productt.getUnitPrice();
//			detail = productt.detail;
			detail = productt.getDetail();
			System.out.println("Isim: " + name + ", " + unitPrice + ", " + detail + ".");
			
			
		}

	}

	public void UrunleriListele() {

	}

	public void addToCart(Product product) { // sepete ekleme
		// System.out.println("Sepete ekleme kodu çagrildi");

		//System.out.println(product.name + " sepete eklendi.");
		System.out.println(product.getName() + " sepete eklendi.");
	}

	public void numberOfProducts() {
		System.out.println("Toplam ürün sayisi: " + products.length);

	}
}
