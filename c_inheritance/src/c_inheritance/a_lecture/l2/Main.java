package c_inheritance.a_lecture.l2;
//loglama;
//birbirinin alternatifi olan kodlar icin if kullanilmaz (ifle yonetilmez).
public class Main {

	public static void main(String[] args) {
		
		LogManager logManager = new LogManager();
		logManager.log(1);
		logManager.log(2);
		logManager.log(3);
		//sikinti.. LogManager'da anlattim...
		//bunun yerine...
		System.out.println("*--------");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());
		customerManager.add(new DatabaseLogger());
		customerManager.add(new EmailLogger());
		

	}

}
