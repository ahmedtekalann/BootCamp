package d_interfaces.a_lecture;

//Dependency Injection (Tasarim deseni)
//iki tip bagimlilik var: loosly - tightly coupled: gevsek - kati bagli
//bagimliliklari lossly'e cekmemiz lazim
public class CustomerManager {

	private Logger logger; // Bagimlilik icin. bagliyiz ama gevsek.

	private Logger[] loggers;

	public CustomerManager(Logger logger) {

		this.logger = logger;
	}

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void addition(Customer customer) {
		
		System.out.println("Musteri eklendi: " + customer.getFirstName());// springle kaynaga ekleme isleri cok kolay
		this.logger.log(customer.getFirstName());
		
	}

	public void multipleAddition(Customer customer) {
		
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
		
	}

	public void multipleAdditionWithUtils(Customer customer) {//static kullanimi
		System.out.println("Musteri eklendi: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		
		System.out.println("Musteri silindi: " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
		
	}

	public void multipleDeletion(Customer customer) {
		
		System.out.println("Musteri silindi: " + customer.getFirstName());
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
		
	}

	public void multipleDeletionWithUtils(Customer customer) {
		
		System.out.println("Musteri silindi: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}

}
