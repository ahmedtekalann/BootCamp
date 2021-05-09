package d_interfaces.b_homework.h1.a_abstracts.b_abstractsDemo;
public class CustomerManager {

    BaseDatabaseManager databaseManager;//bu base sinif bizim stratejimizi veriyor.

    public void getCustomers(){
        /*OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();*/
        //bu kullanim sikinti. bagimli hale geldik.
        //farkli yontemler var. bunlardan strateji pattern'inin kullanacagiz.

        databaseManager.getData();

    }
}
