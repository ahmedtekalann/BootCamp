package d_interfaces.a_lecture;

public class Main {

	public static void main(String[] args) {
		
		
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger()); //Senin bagimliligin Database'dir.
		CustomerManager customerManager2 = new CustomerManager(new FileLogger()); //Senin bagimliligin File'dir.
		CustomerManager customerManager3 = new CustomerManager(new SmsLogger()); //Senin bagimliligin Sms'tir.
		CustomerManager customerManager4 = new CustomerManager(new EmailLogger()); //Senin bagimliligin Email'dir.
		
		
				
		Customer customer = new Customer(1,"Ahmed","Tekalan");
		customerManager.addition(customer);
		customerManager2.addition(customer);
		customerManager3.addition(customer);
		customerManager4.addition(customer);
		
		System.out.println("--------");
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		CustomerManager customerManager5 = new CustomerManager(loggers); //Senin bagimliligin tm Logger siniflaridir.
		customerManager5.multipleAddition(customer);

	}

}
