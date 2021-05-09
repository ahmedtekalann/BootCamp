package d_interfaces.b_homework.h1.a_abstracts.a_abstractsClasses;

public class Main {

	public static void main(String[] args) {
		FemaleGameCalculator femaleGameCalculator = new FemaleGameCalculator();
        femaleGameCalculator.hesapla();

        /*GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void hesapla() {

            }
        };*/
        //abstract siniflar asla new'lenemez (tek basina kullanilamaz).
        //newlenebilmesi icin onun operasyonlarini ezmemiz gerekir.
        //iyi bi kullanim degil. cunku her new'ledigimde icerisini doldurmak
        //sacma olur.
        GameCalculator gameCalculator2 = new FemaleGameCalculator();
        gameCalculator2.gameOver();
        gameCalculator2.hesapla();

	}

}
