package a_intro.b_homework.h3;

public class MukemmelSayi {

	public static void main(String[] args) {
		// Kendinden baska + t�m tam bolenlerin sayisi
		// kendisi hari� pozitif tam b�lenlerinin toplami kendisine esit olan sayi.

		int sayi = 28;
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0)
				toplam += i;
		}
		if (toplam == sayi)
			System.out.println("M�kemmel sayidir.");
		else
			System.out.println("M�kemmel sayi degildir.");

	}

}
