package a_intro.a_lecture;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "�nternet �ubesi";

		double dolarDun = 8.18;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		/*
		 * else { System.out.println("Dolar y�kseldi resmi"); }
		 */
		// burada bir bug var onu cozmek �c�n;
		// 1.�stteki else'i d�zenliyoruz bu k�sma al�yoruz;
		else {
			System.out.println("Dolar e�ittir resmi");
		}

		/*
		 * String kredi1="H�zl� Kredi"; String kredi2="Mutlu emekli kredisi"; String
		 * kredi3="Konut kredisi"; String kredi4="�ift�i kredisi"; String
		 * kredi5="Msb kredisi"; String kredi6="Meb kredisi";
		 * 
		 * System.out.println(kredi1); System.out.println(kredi2);
		 * System.out.println(kredi3); System.out.println(kredi4);
		 * System.out.println(kredi5); System.out.println(kredi6);
		 */

		// Array'ler (Diziler)
		String[] krediler = { "H�zl� Kredi", "Mutlu emekli kredisi", "Konut kredisi", "�ift�i kredisi", "Msb kredisi",
				"Meb kredisi" };
		// b�rb�r�ne benzer �sler� b�z�m bel�rtt�g�m�z sart kadar cal�st�rmaya yarar
		// "foreach": iterate over an array or iterable
		for (String kredi : krediler) { // elemanlar� tek tek dola�mak
			System.out.println(kredi);// kredi ilk, ilk eleman� al�r (H�zl� kredi)
		}
		// !!!bu sayede elle yen� obje olusturmak yer�ne dizinin �c�ne yazmak daha
		// mant�kl�d�r.!!!!

		// foreach her yerde kullan�lamayab�l�r. for her yerde kullan�lab�l�r.
		// "for": use index on array
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		// referans tipleri

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		// java bilgisayar�n belle�inde de�i�kenleri iki �ekilde tutar: value
		// types(de�er atamas� yap�l�r ve ba�lant� kopar�l�r, (int, float, double,
		// boolean(0,1)), de�i�ken de veri de stack'te tutulur)
		// reference types((array(say�sal da metinsel de olsa referans
		// tiptir),class,interface,abstract class), de�i�keni stack'te, de�er heap'te
		// tutulur, belleklerde veriler adreslerde tutulur bu sayede stack ve heap aras�
		// ba�lant�lar kurulur, atamalarda adres adrese atama yapar, bellekte bo� kalan
		// adres GARBAGE COLLECTOR arac�l�g�yla tem�zlen�r cunku art�k atama yap�ld� ve
		// bo�ta kald�(sayilar1=sayilar2(iki dizi)))

		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);

		// Stringler(metinler) arkaplanda char array olarak tutulur char []
		// metin=['','',...,''];
		// String istisnai durumdur. her ne kadar referans tip olsa da (array) de�er tip
		// olarak �al���r. Java veya C# gibi 3.nesil programlama dillerinde

	}

}
