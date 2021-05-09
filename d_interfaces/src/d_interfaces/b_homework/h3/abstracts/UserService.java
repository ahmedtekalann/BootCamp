package d_interfaces.b_homework.h3.abstracts;

import d_interfaces.b_homework.h3.entities.User;

public interface UserService {

	void register(User user) throws Exception;

	void multipleRegisteration(User[] user);

	void update(User user);

	void deletion(User user);

}
