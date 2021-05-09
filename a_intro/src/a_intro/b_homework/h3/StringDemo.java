package a_intro.b_homework.h3;

public class StringDemo {

	public static void main(String[] args) {
		// String metodlari
		// charAt(); belirtilen indexteki char'in degerini verir.
		String mesaj = "Selamun Aleyk�m kardes";
		System.out.println(mesaj.charAt(8));

		// concat(); metinleri birlestirir.
		System.out.println(mesaj.concat(". Aleyk�m selam canim"));

		// startsWith(); ve endsWith(); boolean d�nd�r�r.
		// startsWith(); belirtilen degerle mi basliyor true veya false verir soruya
		// gore. endsWith() tam tersi
		System.out.println(mesaj.startsWith("S"));
		System.out.println(mesaj.endsWith("s"));
		mesaj = mesaj.concat(", Aleyk�m selam kardesim");
		System.out.println(mesaj.endsWith("m"));

		// getChars(); karakterleri alan metod. bi sey d�nd�rmez. sondaki parametre
		// ka�inci index'ten baslayacagini ayarlar.
		char[] karakterler = new char[15];
		mesaj.getChars(0, 15, karakterler, 0);
		System.out.println(karakterler);

		// indexOf(); karakter kacinci indexte. lastIndexOF(); aramaya sagdan baslar
		System.out.println(mesaj.indexOf("�"));
		// System.out.println(mesaj.indexOf("�")); ikinci �'y� bulmak istiyorum
		System.out.println(mesaj.lastIndexOf("�"));

		// replace()

		// substring() verilen degerden itibaren metni b�ler. bir cok constructor'i var.
		// ilk degerden sonra virgul birakilip
		// bir deger daha girilirse o degere kadar anlamini tasir. 2,4 2'den basla 4'e
		// kadar (4 dahil degil)

		// split() bir metni belli bir karakter veya karakter dizisini dikkate alarak
		// parcalamaya yarar

		// toLowerCase() toUpperCase harfleri k���ge b�y�ge d�n�st�r�r

		// trim basta ve sondaki bosluklars siler

	}

}
