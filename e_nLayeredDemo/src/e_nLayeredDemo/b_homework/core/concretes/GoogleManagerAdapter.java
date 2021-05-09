package e_nLayeredDemo.b_homework.core.concretes;

import e_nLayeredDemo.b_homework.core.abstracts.GoogleService;
import e_nLayeredDemo.b_homework.entities.concretes.User;
import e_nLayeredDemo.b_homework.microService.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{
	 

	@Override
	public void register(User user) {
		GoogleManager manager = new GoogleManager();
		manager.register(user);
		
	}

}
