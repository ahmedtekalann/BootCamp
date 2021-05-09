package d_interfaces.b_homework.h2.abstracts;

import d_interfaces.b_homework.h2.entities.Customer;

//abstract s�n�flar new'lenemez
public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB." +customer.getFirstName());
		
	}

}
