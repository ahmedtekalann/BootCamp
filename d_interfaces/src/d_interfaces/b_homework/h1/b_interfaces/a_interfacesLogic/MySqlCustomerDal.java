package d_interfaces.b_homework.h1.b_interfaces.a_interfacesLogic;

public class MySqlCustomerDal implements ICustomerDal, IRepository{//sondaki l harfi layer'dan geliyor
    //data access layer
    //veritabanindaki islemler. normalde manager kullaniyoduk o normal programdaki islemler
    @Override
    public void add() {
        System.out.println("My Sql'e eklendi");
    }

}
