package c_inheritance.b_homework.h1.d_overriding;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.hesapla(1000));

        System.out.println("----------");

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager: krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }

        //Ogrenci icin farkli istiyorum. ogrenci class'ina giderek methodun aynisini yazip icerigini farki yaptim.
        //buna override denir.
        //override'a izin vermek istemezsek; "final" yapariz imzayi.

	}

}
