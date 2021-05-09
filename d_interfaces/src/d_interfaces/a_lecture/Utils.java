package d_interfaces.a_lecture;

public class Utils {//Utilites: Araclar
	
	public static void runLoggers(Logger[] loggers, String message) { //static ekliyoruz. cunku new kullanmak istemiyorum.
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
	

}
