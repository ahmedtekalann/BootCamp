package d_interfaces.a_lecture;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Email'e loglandi: "+message);
		
	}

}
