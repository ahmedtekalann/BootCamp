package a_intro.b_homework.h3;

public class ArkadasSayi {

	public static void main(String[] args) {
		// 220-284 en kucuk arkadas sayilar
		// Iki sayi birbirinin kendisi hari� b�lenleri toplamina esitse bu sayilara
		// arkadas sayilar denir.

		int sayi1 = 220, sayi2 = 284;
		int toplam1 = 0, toplam2 = 0;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0)
				toplam1 += i;
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0)
				toplam2 += i;
		}

		if (toplam2 == sayi1 && toplam1 == sayi2)
			System.out.println("Arkadastirlar.");
		else
			System.out.println("Arkadas degildirler.");

	}

}
