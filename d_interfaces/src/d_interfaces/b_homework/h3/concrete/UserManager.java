package d_interfaces.b_homework.h3.concrete;

import d_interfaces.b_homework.h3.abstracts.UserCheckService;
import d_interfaces.b_homework.h3.abstracts.UserService;
import d_interfaces.b_homework.h3.entities.User;

public class UserManager implements UserService {

	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void register(User user) {

		try {

			if (this.userCheckService.checkIfRealPerson(user)) {
				System.out.println("Saved to DB: " + user.getFirstName());
			} else {
				System.out.println("Not a valid person.");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void multipleRegisteration(User[] users) {

		for (User user : users) {
			this.register(user);
		}

	}

	@Override
	public void update(User user) {
		System.out.println("Updated to DB: " + user.getFirstName());
	}

	@Override
	public void deletion(User user) {
		System.out.println("Deleted to DB: " + user.getFirstName());
	}

}
