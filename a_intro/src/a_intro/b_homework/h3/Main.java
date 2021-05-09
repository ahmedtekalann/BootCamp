package a_intro.b_homework.h3;

public class Main {

	public static void main(String[] args) {
		// switchcases
		char not = '4';
		switch (not) {
		case 'A':
			System.out.println("asfasf");
			break;
		case 'Z':
			System.out.println("zxvzxv");
			break;
		default:
			System.out.println(" veya Z degil");

		}

		// while
		int i = 0;
		while (i < 10) {
			System.out.println("while ile " + i);
			i++;
			i = i + 1;
			i += 1;
		}

		// do-while sart uymasa bole do bi kere calisan, sart saglanirsa while gibi
		// �alisan d�ng� tipi
		int j = 1;
		do {
			System.out.println("do-while ile " + i);
			j++;
		} while (j < 10);

	}

}
