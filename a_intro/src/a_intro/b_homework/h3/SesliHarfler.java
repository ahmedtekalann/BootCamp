package a_intro.b_homework.h3;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'A';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalin sesli");
			break;
		default:
			System.out.println("Ince sesli");
		}

	}

}
