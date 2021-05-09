package d_interfaces.b_homework.h2;

import java.util.Date;

import d_interfaces.b_homework.h2.abstracts.BaseCustomerManager;
import d_interfaces.b_homework.h2.adapters.MerniceServiceAdapter;
import d_interfaces.b_homework.h2.concrete.CustomerCheckManager;
import d_interfaces.b_homework.h2.concrete.NeroCustomerManager;
import d_interfaces.b_homework.h2.concrete.StarbucksCustomerManager;
import d_interfaces.b_homework.h2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MerniceServiceAdapter());		
		customerManager.save(new Customer(1,"Ahmed","Tekalan",new Date(1994,1,1) ,"11122233355"));
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager2.save(new Customer(1,"Ahmed","Tekalan",new Date(1994,1,1) ,"11122233355"));

	}

}
