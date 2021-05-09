package e_nLayeredDemo.a_lecture.jLogger;

public class JLoggerManager {
	public void log(String message) {
		//Loglama kodlari var. Biz bunu sistemimizin icine dahil edicez.
		//microservice yapilari da bu mantikla sisteme enjekte edilir...
		System.out.println("J Logger ile loglandi: "+message);
	}
}
