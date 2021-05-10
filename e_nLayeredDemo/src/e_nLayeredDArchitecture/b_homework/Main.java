package e_nLayeredDArchitecture.b_homework;

import e_nLayeredDArchitecture.b_homework.business.abstracts.UserService;
import e_nLayeredDArchitecture.b_homework.business.concretes.UserManager;
import e_nLayeredDArchitecture.b_homework.core.concretes.GoogleManagerAdapter;
import e_nLayeredDArchitecture.b_homework.dataAccess.concretes.HibernateUserDao;
import e_nLayeredDArchitecture.b_homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userManager = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		User user = new User("aa", "aa", "aaaa.com", "aaaaa");
		userManager.register(user);
		
		

	}

}
