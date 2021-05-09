package d_interfaces.b_homework.h1.a_abstracts.b_abstractsDemo;
public class Main {
//Design Pattern mantigi abstractlar'la mumkun.
//Bir musteriyi veritabanina kaydetme mantigi islemi
//farklı db'lere eklemek isteyebiliriz.
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //customerManager.getCustomers();//eger bunu yaparsak getCustomers()'ın
        //Data'si calisacak. databaseManager bir abstract oldg icin ortada ornek yok.
        //yani abstract'ı direkt calistiramiyorduk.
        //calistirirsak nullpointer hatasi alicaz. cunku ortada new'lenecek bir
        //sey yok. bunun yerine ;
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomers();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

    }
}
