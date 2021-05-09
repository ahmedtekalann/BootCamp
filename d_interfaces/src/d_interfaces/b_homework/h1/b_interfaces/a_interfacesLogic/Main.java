package d_interfaces.b_homework.h1.b_interfaces.a_interfacesLogic;

public class Main {
//uygulamalarda bagimliligi yonettigimiz yapilardan biri: interface
//if'ler bir class kabul edilmiyor ama digerleri gibi referans tutabilirler.
//classlar tamamlanmis olmali (method'larin is yapmasi gibi)
//abstractlar kimisi dolu kimisi bos olabilir. bos olanı inherit eden doldurmak zorunda (implemente etmek).
//interface'lerde operasyonlar tamamlanmamistir. bazi programlama dillerinde abstract gibi kullanilabiliyor.
//yani ici dolduruluyor (doldurulabilir operasyonlar). ama yanlis bir anti pattern, davranis
//interface'in avantaji, if'ler implentasyon kabul ediliyor, inheritance degil,
//bu sayede bi class birden fazla interface'i implente edebilir.
    public static void main(String[] args) {
        //if, onu implente eden class'in referansini tutabilir (polymorphism)
        ICustomerDal customerDal = new OracleCustomerDal();
        //hangi operasyon implente edilmek istenirse o zaman kullanilir interface.
        //interfacelogic.CustomerManager customerManager = new interfacelogic.CustomerManager();
        //customerManager.add();//nullpointer. newlenemez.
        //customerManager.customerDal = new interfacelogic.OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());// polymorphism'e ornek
        customerManager.add();
    }
}
