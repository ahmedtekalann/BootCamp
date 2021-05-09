package d_interfaces.b_homework.h3.adapters;

import java.time.ZoneId;

import d_interfaces.b_homework.h3.abstracts.UserCheckService;
import d_interfaces.b_homework.h3.entities.User;
import d_interfaces.b_homework.h3.services.mernisWebServiceClient.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) throws Exception {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		return client.TCKimlikNoDogrula(Long.valueOf(user.getNatioanalityId()), user.getFirstName().toUpperCase(),
				user.getLastName().toUpperCase(),
				user.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());

	}

}
