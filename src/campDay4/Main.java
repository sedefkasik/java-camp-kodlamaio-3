package campDay4;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter()); 
		Customer sedef = new Customer(1,"test","test",LocalDate.of(1000,01,01),"11111111110");
		baseCustomerManager.Save(sedef);
	}

}
