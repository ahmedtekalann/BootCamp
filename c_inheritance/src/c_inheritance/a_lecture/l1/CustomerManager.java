package c_inheritance.a_lecture.l1;

public class CustomerManager {
	
	/*public void add(IndividualCustomer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	
	public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}*/
	
	//ayri yazmak yerine base'i gec
	
	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber+" kaydedildi.");
		
	}
	//polymorphism'den oturu yine calisacak. cunku her ikisine de ba�ta Base dedik, referans uzerinden calistilar. "extends Customer"
	
	//SOLID- Open Closed Principle:sisteme yeni ozellik eklendiginde mevcutta bulunan hicbir kodu degistiremezsin
	
	//bulk insert, coklu ekleme
	public void addMultiple(Customer[] customers) {//array da gonderebiliriz.
		
		for (Customer customer : customers) {
			add(customer);
		}
		
	}

}
