package e_nLayeredDArchitecture.b_homework.microService;

import e_nLayeredDArchitecture.b_homework.entities.concretes.User;

public class GoogleManager {
	public void register(User user) {
		System.out.println("Signed up with Google: "+user.getFirstName());
	}

}
