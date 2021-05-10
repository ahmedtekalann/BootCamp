package e_nLayeredDArchitecture.b_homework.core.abstracts;

public interface EmailVerificationService {
	
	void sendVerificationMail(String email);
	boolean isVerified(String option); 

}
