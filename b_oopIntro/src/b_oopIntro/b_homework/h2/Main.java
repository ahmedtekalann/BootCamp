package b_oopIntro.b_homework.h2;

//classlarin ilk ve temel ozelligi gruplama yapmaktir (operasyonlar�n gruplanmasi). fakat sadece bu bilgi bizim 
//surdurulebilir yazilim yapmamizi saglamaz.
//classlar referans tiptir.
public class Main {

	public static void main(String[] args) {
		// Class cagirma islemi:
		CostumerManager customerManager = new CostumerManager(); // bellekte nesne uretildi.
		// sol taraf yani degisken stack'te tutulur.
		customerManager.Add(); // bellekte uretildigi icin bu metodlar da artik bellekte calisir. (heap)
		customerManager.Remove();
		customerManager.Update();

		// eger ikinci nesneyi ilk nesneye atarsak ilk nesnenin referans numaras�
		// heap'te bosta kalmis olur.
		// bu durumda bellek fazladan bilgi tutmus olacagi icin Garbage Collector denen
		// yapi bunu siler.
		// new bu yuzden pahalidir. cunku bellekle ilgilidir. ama surdurulebilir yazilim
		// yapmak icin mecburuz.
		CostumerManager customerManager2 = new CostumerManager();
		customerManager = customerManager2;

		// deger tiplerdir. (value type) deger tiplerde degisken de deger de stack'te
		// tutulur. heap'le i�i yoktur.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = { 4, 5, 6 }; // sag taraflar ayni anlam icerir.
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]); // diziler (int, String farketmez) referans tiptir. O yuzden heap ile ugrasir
											// Bu yuzden sayilar2[0]=1 degil 10 olacak.
		System.out.println(sayilar2[1]);
		sayilar1[1] = 20;
		System.out.println(sayilar2[1]);

	}

}
