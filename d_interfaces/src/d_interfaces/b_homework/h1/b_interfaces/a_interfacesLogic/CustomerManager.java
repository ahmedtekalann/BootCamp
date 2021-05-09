package d_interfaces.b_homework.h1.b_interfaces.a_interfacesLogic;

public class CustomerManager {
    private ICustomerDal customerDal; //bir yontem bagimliliktan kurtulmak icin
    //ikinci yontem, DAHA IYI; yukariyi private yap, erismesin implent olan kucuk yapilar
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }// polymorphism'e ornek



    public void add(){
        /*interfacelogic.OracleCustomerDal customerDal = new interfacelogic.OracleCustomerDal();
        customerDal.add();*///bagimlilik!!
        customerDal.add();
    }
}
