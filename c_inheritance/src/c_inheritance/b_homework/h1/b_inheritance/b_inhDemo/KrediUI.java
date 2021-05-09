package c_inheritance.b_homework.h1.b_inheritance.b_inhDemo;
//Manager'da yazdigimiz kodlari UI'da cagiririz. //IntelliJ, ASP.NET, PHP vs.. bunlarin hepsi birer UI. Arkada kodlar
//calisiyor.
public class KrediUI {//Bir Arayuzden cagirilacagini varsayiyoruz.
	//Butonlar, textBox'lar vs bunlarin birbiriyle i� yapmas�.
    /*public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager){
        ogretmenKrediManager.Hesapla();
    }*/
	public void krediHesapla(BaseKrediManager baseKrediManager){
        baseKrediManager.hesapla();
    }

}
