package a_intro.b_homework.h3;

public class ArraysDemo {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 7.3, 5.6 }; // diziyi {} ve newle boyut vererek yazdirmak arasinda bir fark yok
		// {}'de arkaplanda new islemini yapiyor.
		double total = 0;
		for (double number : myList) {
			System.out.println(number);
		}
		System.out.println("-------------");
		for (double number : myList) {
			total = total + number;
		}
		System.out.println("Toplam: " + total);
		System.out.println("-------------");
		double max = 0;
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
		}
		System.out.println(max);
		System.out.println("-------------");
		// multiDimensionalArray
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Istanbu";
		sehirler[0][2] = "Istanb";
		sehirler[1][0] = "Istan";
		sehirler[1][1] = "Ista";
		sehirler[1][2] = "Ist";
		sehirler[2][0] = "Is";
		sehirler[2][1] = "I";
		sehirler[2][2] = "Istanbul";
		for (int i = 0; i < sehirler.length; i++) { // sehirler.length de olur direkt sayisal deger de olur i<3
			System.out.println("-------------");
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
