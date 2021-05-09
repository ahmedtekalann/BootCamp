package d_interfaces.a_lecture;
//interface'de implemente edilecek metodlari uygulamak zorundayiz. inheritance'de zorunlu deðil, istersek yapariz.
public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms'e loglandi: "+message);
		
	}
	
}
