package e_nLayeredDemo.b_homework;

import e_nLayeredDemo.b_homework.business.abstracts.UserService;
import e_nLayeredDemo.b_homework.business.concretes.UserManager;
import e_nLayeredDemo.b_homework.core.concretes.GoogleManagerAdapter;
import e_nLayeredDemo.b_homework.dataAccess.concretes.HibernateUserDao;
import e_nLayeredDemo.b_homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userManager = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		User user = new User("aa", "aa", "aaaa.com", "aaaaa");
		userManager.register(user);
		
		

	}

}
