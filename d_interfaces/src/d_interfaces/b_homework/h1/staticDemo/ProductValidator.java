package d_interfaces.b_homework.h1.staticDemo;
//Bir urunu kaydederken, guncellerken urunun kurallara uygun olup olmadigini bulmak icin kullanilir.
public class ProductValidator {
    //bu kisim, isValid icin calismaz
    public ProductValidator(){
        System.out.println("Constructor calisti");
    }
    //calismasi icin statik constructor olusturulur;
    static { //birden fazla olusturulabilir.
            System.out.println("Static yapici blok calisti.");
    }

    //ben sana bir product vericem sen bana bunu dogrula
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void biSey(){

    }

    //ana class, Java'da static olamiyor. ama inner class'la olur. (class icinde class)
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
    //siniflandirma icin kullanilabilir. (db operasyonu)


}
