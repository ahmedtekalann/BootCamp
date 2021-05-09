package d_interfaces.b_homework.h2.concrete;

import d_interfaces.b_homework.h2.abstracts.CustomerCheckService;
import d_interfaces.b_homework.h2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
		
	}

	

	

}
