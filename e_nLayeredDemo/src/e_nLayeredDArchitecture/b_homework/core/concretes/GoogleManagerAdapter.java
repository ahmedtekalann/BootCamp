package e_nLayeredDArchitecture.b_homework.core.concretes;

import e_nLayeredDArchitecture.b_homework.core.abstracts.GoogleService;
import e_nLayeredDArchitecture.b_homework.entities.concretes.User;
import e_nLayeredDArchitecture.b_homework.microService.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{
	 

	@Override
	public void register(User user) {
		GoogleManager manager = new GoogleManager();
		manager.register(user);
		
	}

}
