package a_intro.b_homework.h3;

public class MiniProje1_SayiAsalMi {

	public static void main(String[] args) {
		int number = -1;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("En k���k asal sayi 2'dir. 1 asal sayi degildir.");
			return;
		}
		if (number < 1) {
			System.out.println("Ge�ersiz sayi");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				isPrime = false;
		}
		if (isPrime)
			System.out.println("Sayi asaldir");
		else
			System.out.println("Sayi asal degildir");

	}

}
