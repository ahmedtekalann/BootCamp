package e_nLayeredDemo.b_homework.core.abstracts;

public interface EmailVerificationService {
	
	void sendVerificationMail(String email);
	boolean isVerified(String option); 

}
