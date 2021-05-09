package c_inheritance.a_lecture.l1;

public class Main {

	public static void main(String[] args) {
		/*Customer customer = new Customer();
		customer.id=1;
		customer.firstName="Ahmed";
		customer.lastName="Tekalan";
		customer.nationalIdendity="1000000";
		customer.companyName="";*/ /*yanlis, sistemin izin verdigi her seyde patlariz.*/
		
		IndividualCustomer ahmed = new IndividualCustomer();
		ahmed.customerNumber="12345";
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(ahmed);
		customerManager.add(hepsiBurada);
		//polymorphism'den oturu yine calisti. cunku her ikisine de ba�ta Base dedik, referans uzerinden calistilar. "extends Customer"
		customerManager.add(sendikaCustomer);
		
		//yukaridakileri yapmak yerine coklu gonderme (array)
		
		System.out.println("--------");
		Customer[] customers = {ahmed, hepsiBurada, sendikaCustomer};		
		customerManager.addMultiple(customers);
		
		
		

	}

}
