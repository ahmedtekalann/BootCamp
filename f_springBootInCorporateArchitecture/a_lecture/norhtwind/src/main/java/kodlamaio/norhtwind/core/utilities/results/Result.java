package kodlamaio.norhtwind.core.utilities.results;

public class Result {
	//tum requestlerde kullanabılınen yapı
	private boolean success;
	private String message;	

	public Result(boolean success) {
		this.success=success;
	}
	
	public Result(boolean success, String message) {
		this(success);
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}	

	public String getMessage() {
		return message;
	}
	
	
}
