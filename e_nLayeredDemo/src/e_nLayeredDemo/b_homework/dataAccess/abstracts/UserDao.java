package e_nLayeredDemo.b_homework.dataAccess.abstracts;

import java.util.List;

import e_nLayeredDemo.b_homework.entities.concretes.User;

public interface UserDao {
	void register(User user);
	User getUserByEmail(String email);
	List<User> getAll();

}
