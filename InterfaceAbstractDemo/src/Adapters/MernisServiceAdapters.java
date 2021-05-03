package Adapters;

import abstracts.CustomerCheckService;
import entities.Customer;

public class MernisServiceAdapters implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		//Mernis ekleme
		//KPSPublicSoapClient client=new KPSPublicSoapClient();
		
		// return client.TCKimlikNoDogrula(customer.nationalityId,
		// customer.firstName.toUpper(), customer.lastName,
		// customer.dateOfBirth.Year);
		return false;
	}
	

}
