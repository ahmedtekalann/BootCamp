package b_oopIntro.b_homework.h2;

public class Methods2 {

	public static void main(String[] args) {
		add();

		delete();

		update();

		String getcity = getCity();
		System.out.println(getcity);

		int sum = sum(10, 56);
		System.out.println(sum);

		int numbers = sumOfNumbers(1, 2, 3, 6, 8, 12);
		System.out.println(numbers);

	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static String getCity() {
		return "Ankara";
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	// Birden fazla parametre degeri gondermek icin "variable arguments" dedigimiz
	// kavram var, o da soyle:

	public static int sumOfNumbers(int... numbers) { // "..." yani 3 nokta, birden fazla sayi alir.
		// bu, dizi gibi calisir. arkaplanda diziye cevriliyor. (int array)
		int toplam = 0;
		for (int number : numbers) {
			toplam += number;
		}
		return toplam;
	}

	// variable arguments her zaman kullanilamayabilir. farkl� veri tipleri
	// geldiginde
	// test edilebilirlik zay�flar.

}
