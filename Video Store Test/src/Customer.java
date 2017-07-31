import java.util.List;
import java.util.*;

public class Customer {

	String customerName;

	int numberOfRentals;

	List<Movie> moviesRented = new ArrayList<Movie>();

	static Scanner input= new Scanner(System.in);

	public Customer(String customerName) 
	{
		this.customerName = customerName;
	}

	public void statement()
	{
		while(true)
		{
			System.out.println("Please enter movie name : ");
			String movie=input.next();
			System.out.println("Please enter number of rental days : ");
			String days = input.next();

			int numberOfDays = Integer.parseInt(days);
			Movie movieClass = new Movie(movie, numberOfDays);
			moviesRented.add(movieClass);
			if(!yesTo("Do you want to add another movie?"))
			{
				break;
			}
		}

		printStatement();

	}

	private void printStatement() 
	{
		double TotalCost = 0;

		int TotalPoints = 0;

		System.out.println();

		System.out.println("---------------------------------------------------------------------------------------------");

		System.out.println("Billing Invoice");

		System.out.println();

		System.out.println("Customer : " + getCustomerName());

		System.out.println();

		for(Movie movie : moviesRented){

			System.out.println("Movie Name : " + movie.getTitle() + " | Movie Rental Cost : $ " + movie.getPrice() +
					" | Movie Type : " + movie.getMovieType() + " | Number Of days : " + movie.getRentalClass().getNumberOfDays() +
					" | Frequent Renter Points : " + movie.getRentalClass().getFrequentRenterPoints() + " | Cost : $ " + movie.getPrice()*movie.getRentalClass().numberOfDays);
			
			TotalCost = TotalCost + movie.getPrice()*movie.getRentalClass().numberOfDays;
			TotalPoints = TotalPoints + movie.getRentalClass().getFrequentRenterPoints();
		}

		System.out.println();
		System.out.println("Total Rental Cost = $ " + TotalCost);
		System.out.println("Total frequent renter points accumulated = "+ TotalPoints);
	}

	public static boolean yesTo(String prompt)
	{
		System.out.print(prompt + " (y/n)? ");
		String response = input.nextLine().trim().toLowerCase();
		while (!response.equals("y") && !response.equals("n")) 
		{
			System.out.println("Please answer y or n.");
			System.out.print(prompt + " (y/n)? ");
			response = input.nextLine().trim().toLowerCase();
		}
		return response.equals("y");
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public int getNumberOfRentals() 
	{
		return numberOfRentals;
	}

	public void setNumberOfRentals(int numberOfRentals)
	{
		this.numberOfRentals = numberOfRentals;
	}

	public List<Movie> getMoviesRented() 
	{
		return moviesRented;
	}

	public void setMoviesRented(List<Movie> moviesRented)
	{
		this.moviesRented = moviesRented;
	}

}
