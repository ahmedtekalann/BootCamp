package c_inheritance.b_homework.h1.b_inheritance.b_inhDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();//bu sekilde de gonderebiliriz.
        //Bu ikisi ayn�//
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager());
        //Baska kredi cesidi eklenecek olursa DRY'a ugramis oluruz KrediHesapla methodunu overload ederek.
        // Bunun yerine inherit etmistik zaten kredi cesitlerini. O yuzden ogretmeninki silip direkt miras vereni
        //(BaseKrediManager'i) yazmamiz gerekir. Boylece diger mirascilari da yazabilelim.
        //Miras veren, mirascilarinin referansini tuttugu icin bir hatayla kars�lasmayiz. Aslinda biz, bu i�lemler
        //le (inherit) polimorfizm yapmis olduk.
        krediUI.krediHesapla(new TarimKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());

	}

}
