package d_interfaces.b_homework.h3.abstracts;

import d_interfaces.b_homework.h3.entities.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user) throws Exception;
}
