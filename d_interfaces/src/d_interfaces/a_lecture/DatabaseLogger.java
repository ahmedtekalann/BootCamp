package d_interfaces.a_lecture;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Database'e loglandi: "+message);
		
	}

}
