package Concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	

 public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


@Override
public void save(Customer customer) {
	if(customerCheckService.CheckIfRealPerson(customer)) {
		super.save(customer);	
	}else {
		System.out.println("Not a valid person");
	}
	
}







 
}
