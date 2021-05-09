package e_nLayeredDemo.a_lecture.core;

import e_nLayeredDemo.a_lecture.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService { //Adaptasyon sinifi. Adapter Design pattern'inin imlpementasyonu

	@Override
	public void logToSystem(String message) {
		
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	} 

}
