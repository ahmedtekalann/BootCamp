package c_inheritance.b_homework.h1.c_polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }

    //veritabanina ekleme islemleri...
    public void add(){
        System.out.println("Customer added.");

        /*DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.Log("BaseLogger Aktif) Log Mesaji: ");*/

        //artik classlar icinde surekli new yapmayacagiz. yaparsak s�n�fa bagimli hale geliriz.
        //bagimli sistemler yapmak yerine s�n�fta ana olan� olu�turucaz.

        this.logger.log("(Base Logger Aktif) Log Mesaji: ");
    }

}
