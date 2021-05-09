package c_inheritance.b_homework.h1.c_polymorphismDemo;
//cok bicimlilik. referans tiplerin inheritance varsa birbirlerinin referansini tutmasi.
public class Main {

	public static void main(String[] args) {
		/*EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Logged to email.");*/

        /*DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Logged to database.");

        FileLogger fileLogger = new FileLogger();
        fileLogger.log("Logged to file.");*/

        //Boooyle uzun uzun burada yazmak yerine her bir mirasciya gidilir, miras verenin bu metodu onlara yazilir
        //buna override denir. �zerine yazmak. methodoverriding. yukaridakileri o yuzden yorumlicam.

        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Merhaba, ashgasfsa, Saygilarimla.");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Ahmed Tekalan eklendi.");

        FileLogger fileLogger = new FileLogger();
        fileLogger.log("Dosya sakfaskf\\ajsfghasgfas\\ konumuna eklendi.");

        BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger(), new ConsolLogger()};
        for (BaseLogger logger:baseLoggers) {
            logger.log("(BaseLogger Aktif) Log Mesaji: ");
        }
        //polymorphism oldu. Polymorphism'i interface de yapabilir.

        System.out.println("----------");

        //nereye loglanmasi istiyorsa...
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
        CustomerManager customerManager1 = new CustomerManager(new DatabaseLogger());
        customerManager1.add();
        CustomerManager customerManager2 = new CustomerManager(new EmailLogger());
        customerManager2.add();
        CustomerManager customerManager3 = new CustomerManager(new ConsolLogger());
        customerManager3.add();

	}

}
