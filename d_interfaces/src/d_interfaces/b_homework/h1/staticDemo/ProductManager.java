package d_interfaces.b_homework.h1.staticDemo;
//Urunun eklenecegi ortam
public class ProductManager {
    //Urunu veritabanina gonderecek, ekleyecek
    public void add(Product product){

        /*ProductValidator productValidator = new ProductValidator();
        //product varsa
        if(productValidator.isValid(product)){
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Urun bilgileri gecersiz.");
        }*/

        //utility araclariyla(valid.'in amaci bu) bunu new'siz kullanmak istiyorum
        //Valid'in metoduna erişmek için metodu STATIC kullanirim. tanimlandigi yerde
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Urun bilgileri gecersiz.");
        }
        //static, yine nesnenin ornegini olusturuyor fakat bir kere olusuyor.
        //yani orn web uyg.'da kullandigimizda butun kullanicilar onu o sekilde kullanmis olur. Ayni nesneyi, methodu vs. kullanmis oluyor herkes
        //cok yaygin degildir. bu tur arac kullanimlarinda kullanilir.
        //normalde tek kullanimdan sonra bellekten temizleniyor ama static kullanildiginda
         //program durdurulana kadar bellekten atilmiyor.
        //Manager class'lari static yapilmaz. kullan birak utility dedigimiz araclar
         //kullanir.

        //ozet olarak bir metod staticse o metod class ismiyle birlikte cagirilir. X.mY(); cagirildigi anda bellekte olusturulur.
        //instance'i olusturmadan. static degilse cagirabilmek icin instance olusturmak gerekir. yani new'lemek gerekir.
        /*ProductValidator productValidator = new ProductValidator();
        productValidator.biSey();*/
        //constructor'lar new'leyince calisir. staticte calismaz. (c#da calisir.)
        //calistirmak icin static constructor olusturulur.


    }

}
