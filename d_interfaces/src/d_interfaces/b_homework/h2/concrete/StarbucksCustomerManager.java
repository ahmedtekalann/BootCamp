package d_interfaces.b_homework.h2.concrete;

import java.rmi.RemoteException;

import d_interfaces.b_homework.h2.abstracts.BaseCustomerManager;
import d_interfaces.b_homework.h2.abstracts.CustomerCheckService;
import d_interfaces.b_homework.h2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {

		// mernis dogrulamasi
		try {
			if (this.customerCheckService.checkIfRealPerson(customer)) {
				System.out.println("Saved to DB: " + customer.getFirstName());
			} else {
				System.out.println("Not a valid person.");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
