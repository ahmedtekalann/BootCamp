package c_inheritance.b_homework.h1.b_inheritance.a_inh;
//nesnelerin birbirine biraktigi miras
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
        Employee employee =new Employee();

        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        employeeManager.add();
        employeeManager.list();
        employeeManager.employeeOfTheMonth();
        customerManager.add();
        customerManager.list();

	}

}
