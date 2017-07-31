import java.util.*;
import java.io.*;
public class RentalBilling 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of the customer : ");

		String customerName= input.nextLine();

		Customer customer = new Customer(customerName);

		customer.statement();
	}

}