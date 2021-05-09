package e_nLayeredDemo.b_homework.business.concretes;

import java.util.List;

import e_nLayeredDemo.b_homework.business.abstracts.UserCheckService;
import e_nLayeredDemo.b_homework.business.abstracts.UserService;
import e_nLayeredDemo.b_homework.business.utilities.Utility;
import e_nLayeredDemo.b_homework.core.abstracts.GoogleService;
import e_nLayeredDemo.b_homework.dataAccess.abstracts.UserDao;
import e_nLayeredDemo.b_homework.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager() {
		
	}
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao=userDao;
		this.googleService=googleService;
	}

	@Override
	public void register(User user) {					
		
		Utility.deneme(user);
		this.userDao.register(user);
		this.googleService.register(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void signup(User user) {
		Utility.signup(user);
		
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.getUserByEmail(email);
	}

}
