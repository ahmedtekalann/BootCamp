package d_interfaces.b_homework.h1.a_abstracts.a_abstractsClasses;

public abstract class GameCalculator {
	public abstract void hesapla();

    public final void gameOver(){ //tamamlanmis operasyon
        System.out.println("Game Over.");
    }

    //Benim 1 tane fonksiyonum var onun icerisini base'de belirlemek istemiyorum
    //ama bunu kim inherit ediyorsa o fonksiyonu override etmek zorunda!

    //abstract bir class'ta abstract method olmak zorunda degil. hem final hem abstract,
    //sadece final, sadece abstract da olabilir.

    //abstract'lar base'i gizlemek istedi�imizde de kullanabiliriz.

    //kisacaasi, new'leyemiyoruz ve zorunlu operasyonlar ekleyebiliyoruz.

}
