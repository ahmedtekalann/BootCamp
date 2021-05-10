package e_nLayeredDArchitecture.b_homework.dataAccess.concretes;

import java.util.List;

import e_nLayeredDArchitecture.b_homework.dataAccess.abstracts.UserDao;
import e_nLayeredDArchitecture.b_homework.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		
		System.out.println("Registered with Hibernate. : "+user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
