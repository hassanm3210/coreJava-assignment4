package coreJavaAssignment;

public class CreateCustomer {
		//Core java assignment 1.1
	//protected int custID = 87612;
	protected int custID;
	protected String custName;
	//static private String custCity = "London";
	//static int custAge = 28;
		//Core Java assignment 2.1
	static int custCount = 0;
	public final int MAXPHONES ;
	
	public CreateCustomer(int id, String name, int max) {
		custID = id;
		custName = name;
		MAXPHONES = max;
		
	}
	
	public void print() {
		System.out.println("Customer ID: " + custID + ", Customer name: " + custName + ", custPhone: " + MAXPHONES);
	}
	
	//public void printCust() {
		
		//System.out.println("The customer id is (public modifier): " + custID);
		//System.out.println("The customer name is(protected modifier): " + custName);
		//System.out.println("The customer id is (private modifier): " + custCity);
		//System.out.println("The customer name is(default modifier): " + custAge);
		
}
