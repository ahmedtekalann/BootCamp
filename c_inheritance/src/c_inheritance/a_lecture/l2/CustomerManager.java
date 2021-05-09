package c_inheritance.a_lecture.l2;

public class CustomerManager {
	
	/*public void add() {
		System.out.println("Musteri ekleme kodlari. Musteri eklendi.");
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log();//bu hareketi her yerde yapmak zorunda kalirsak yine spagetti...
		//yani bir kodun �cer�s�nde baska b�r �s yapan kod varsa bu kod surduruleb�l�r olmaz...
		//bunun yerine;
	}*/
	
	public void add(Logger logger) {
		System.out.println("Musteri ekleme kodlari. Musteri eklendi.");
		logger.log();//Temel sinifi verdik. her miras alani gonderebiliriz... logger'in oldugu yere. cunku base, miras alanlarinin referansini tutabilir.
	}

}
