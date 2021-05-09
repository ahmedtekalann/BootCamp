package e_nLayeredDemo.b_homework.business.abstracts;

import java.util.List;

import e_nLayeredDemo.b_homework.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void signup(User user);
	User getUserByEmail(String email);
	List<User> getAll();

}
