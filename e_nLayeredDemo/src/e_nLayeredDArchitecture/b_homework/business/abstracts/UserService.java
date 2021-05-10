package e_nLayeredDArchitecture.b_homework.business.abstracts;

import java.util.List;

import e_nLayeredDArchitecture.b_homework.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void signup(User user);
	User getUserByEmail(String email);
	List<User> getAll();

}
