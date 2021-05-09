package d_interfaces.b_homework.h2.adapters;

import java.rmi.RemoteException;

import d_interfaces.b_homework.h2.abstracts.CustomerCheckService;
import d_interfaces.b_homework.h2.connectedServices.mernisWebServiceClient.KPSPublicSoapProxy;
import d_interfaces.b_homework.h2.entities.Customer;

public class MerniceServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;

		try {
			result = client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()).longValue(),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
