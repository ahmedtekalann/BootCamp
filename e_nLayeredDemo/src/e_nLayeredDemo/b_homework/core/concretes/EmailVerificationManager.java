package e_nLayeredDemo.b_homework.core.concretes;

import e_nLayeredDemo.b_homework.core.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public void sendVerificationMail(String email) {
		System.out.println(email + "Verification mail has been sent to your email address. ");
		
	}

	@Override
	public boolean isVerified(String option) {
		if (option.equals("Click this link. ")) {
			System.out.println("Your email address has been verified. ");
			return true;
		}
		System.out.println("Your email address is not verified.");
		return false;
	}

}
