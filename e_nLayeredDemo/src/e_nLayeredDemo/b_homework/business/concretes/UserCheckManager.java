package e_nLayeredDemo.b_homework.business.concretes;

import e_nLayeredDemo.b_homework.business.abstracts.UserCheckService;
import e_nLayeredDemo.b_homework.business.abstracts.UserService;
import e_nLayeredDemo.b_homework.business.utilities.Utility;
import e_nLayeredDemo.b_homework.core.abstracts.EmailVerificationService;
import e_nLayeredDemo.b_homework.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	private UserService userService;
	private EmailVerificationService emailVerification;
	
	public UserCheckManager(UserService userService, EmailVerificationService emailVerification) {
		this.userService=userService;
		this.emailVerification=emailVerification;
		
	}

	@Override
	public void userCheck(User user) {
		Utility.success(user);		
	}

}
