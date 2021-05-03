import Concrete.NeroCustomerManager;
import abstracts.BaseCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager();
		Customer customer1=new Customer(1, "nazim", "duman", "1979", "12345678901");
		customerManager.save(customer1);
		
	}

}
