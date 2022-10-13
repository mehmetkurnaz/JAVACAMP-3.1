
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditManager creditManager = new CreditManager();

		creditManager.Calculate();
		creditManager.Save();

		Customer customer = new Customer();
		customer.Id = 1;

		customer.City = "KÜTAHYA";

		CustomerManager customerManager = new CustomerManager(customer);

		customerManager.Save();
		customerManager.Delete();

		Company company = new Company();
		company.TaxNumber = 10;
		company.CompanyName = "MT";
		company.Id = 10;

		CustomerManager customerManager2 = new CustomerManager(new Person());

		Person person = new Person();
		person.NationalIdentity = "";
		person.FirstName = "mehmet";

		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();

	}

}
