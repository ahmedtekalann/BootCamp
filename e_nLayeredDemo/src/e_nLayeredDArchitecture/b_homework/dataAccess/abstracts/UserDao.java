package e_nLayeredDArchitecture.b_homework.dataAccess.abstracts;

import java.util.List;

import e_nLayeredDArchitecture.b_homework.entities.concretes.User;

public interface UserDao {
	void register(User user);
	User getUserByEmail(String email);
	List<User> getAll();

}
