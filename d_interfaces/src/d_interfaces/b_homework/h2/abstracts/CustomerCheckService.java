package d_interfaces.b_homework.h2.abstracts;

import java.rmi.RemoteException;

import d_interfaces.b_homework.h2.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
