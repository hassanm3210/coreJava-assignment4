package coreJavaAssignment;

public class Customer {
		
	public static void main(String[] args) {
			//2.3
			Employee employee = new Employee();
			employee.setEmpID(6);
			System.out.println("(2.3) The employee id is :" + employee.getEmpID());
			System.out.println("\n");
			
			
			//2.1 and 2.2
		 CreateCustomer createcustomer1 = new CreateCustomer(1, "Mangesh",2);
		createcustomer1.print();
		CreateCustomer.custCount ++;
		System.out.println("(2.1 and 2.2) " + createcustomer1.custName + " can have maximum of phones: " + createcustomer1.MAXPHONES);
		System.out.println("The number of customers is : " + CreateCustomer.custCount);
		System.out.println("\n");
		CreateCustomer createcustomer2 = new CreateCustomer(2, "Robert",1);
		createcustomer2.print();
		CreateCustomer.custCount ++;
		System.out.println("(2.1 and 2.2)" + createcustomer2.custName + " can have maximum of phones: " + createcustomer2.MAXPHONES);
		System.out.println("The number of customers is : " + CreateCustomer.custCount);
		System.out.println("\n");
		CreateCustomer createcustomer3 = new CreateCustomer(3, "Robert",3);
		createcustomer3.print();
		CreateCustomer.custCount ++;
		System.out.println("(2.1 and 2.2)" + createcustomer3.custName + " can have maximum of phones: " + createcustomer2.MAXPHONES);
		System.out.println("The number of customers is : " + CreateCustomer.custCount);
		
		
		//2.1
		//CreateCustomer createcustomer1 = new CreateCustomer(1, "Mangesh");
		//createcustomer1.print();
		//CreateCustomer.custCount ++;
		//System.out.println("The first customer count is: " + CreateCustomer.custCount);
		
		//CreateCustomer createcustomer2 = new CreateCustomer(2, "Robert");
		//createcustomer2.print();
		//CreateCustomer.custCount ++;
		//System.out.println("The second2 customer count is: " + CreateCustomer.custCount);
				
		//1.1
		//CreateCustomer createcustomer = new CreateCustomer();
		//createcustomer.printCust();
		//1.3
		//System.out.println("The customer id is (public modifier): " + CreateCustomer.custID);
		//System.out.println("The customer name is(protected modifier): " + CreateCustomer.custName);
		//System.out.println("The customer gender is(private modifier): " + CreateCustomer.custCity);
		//System.out.println("The customer name is(default modifier): " + CreateCustomer.custAge);
		//1.2
		//Address address = new Address();
		//address.printAddress();
		//System.out.println("The customer address1 (private access) is: " + Address.custAddr1);
		//System.out.println("The customer address2 (protected access) is: " + Address.custAddr2);
		//System.out.println("The customer address3 (default access) is: " + Address.custAddr3);
		//1.2
		//Contact contact = new Contact();
		// Printing all as Contact print method is public and able to print everything.
		//contact.printAddress();
		//System.out.println("The customer contact1 (private access) is " + Contact.custCont1);
		//System.out.println("The customer contact2 (protected access) is " + Contact.custCont2);
		//System.out.println("The customer contact3 (default access) is " + Contact.custCont3);
		
		}

	}
