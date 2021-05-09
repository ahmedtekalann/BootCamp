package b_oopIntro.b_homework.h2;

public class Methods {

	public static void main(String[] args) {
		sayiBulma();

	}

	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 1;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			print("Sayi mevcut: " + aranacak);
		} else {
			print("Sayi mevcut degil: " + aranacak);
		}
	}

	public static void print(String mesaj) {
		System.out.println(mesaj);
	}

}
