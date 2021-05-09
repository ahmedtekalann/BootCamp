package d_interfaces.b_homework.h3.concrete;

import d_interfaces.b_homework.h3.abstracts.UserCheckService;
import d_interfaces.b_homework.h3.entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		return true;
	}

}
