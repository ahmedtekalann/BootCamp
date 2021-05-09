package b_oopIntro.b_homework.h2;

public class ProductManager {
	public void Addition(Product product) { //Artik Product da bir tur oldugu icin onu parametre olarak geciyoruz.
		//Product'lar gercek hayatta JDBC kodlari ile veritabanina kaydedilir.
		System.out.println("Urun eklendi: "+product.get_name());
		
				
	}
	
	public void Addition2(int id, String name, String description, int stockAmount, double price) {
		//Bu aslinda hatali bi kullanimdir. Soyle ki yeni bi ozellik eklenecek olursa, bircok yerde kullandigimiz
		 //bu metodu, o yerlerin hepsinde degistirmemiz gerekir. Devreye ENCAPSULATION giriyor. (get,set)
	}
}
