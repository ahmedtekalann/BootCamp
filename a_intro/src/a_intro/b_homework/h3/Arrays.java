package a_intro.b_homework.h3;

public class Arrays {

	public static void main(String[] args) {
		String ogrenci = "A";
		String ogrenci2 = "B";
		String ogrenci3 = "C";
		String ogrenci4 = "D";

		System.out.println(ogrenci);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("--------------");

		// bunun yerine array kullanilir. �ok satir eklenmesi gerekiyorsa tek tek yapmak
		// yerine array kullanilir
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "A";
		ogrenciler[1] = "B";
		ogrenciler[2] = "C";
		ogrenciler[3] = "D";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("--------------");

		for (String ogrenc : ogrenciler) {
			System.out.println(ogrenc);
		}

	}

}
