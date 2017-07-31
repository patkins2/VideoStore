//import java.util.List;
import java.text.DecimalFormat;
import java.util.*;

public class Customer {

	String customerName;

	int numberOfRentals;

	List<Movie> moviesRented = new ArrayList<Movie>();

	static Scanner input= new Scanner(System.in);
        
        DecimalFormat df2 = new DecimalFormat("#.00");

	public Customer(String customerName) 
	{
		this.customerName = customerName;
	}

	public void statement()
	{
		while(true)
		{
			System.out.print("Please enter movie name : ");
			String movie=input.nextLine();
			System.out.print("Please enter number of rental days : ");
			int days = input.nextInt();

			int numberOfDays = days;
			Movie movieClass = new Movie(movie, numberOfDays);
			moviesRented.add(movieClass);
                        System.out.print("Do you want to add another movie? (y/n) ");
			if(!yesTo("Do you want to add another movie?"))
			{
				break;
			}
		}

		printStatement();

	}

	private void printStatement() 
	{
		double TotalCost = 0.00;

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
		System.out.print("Total Rental Cost = $ ");
                System.out.printf("%.2f", TotalCost);
                System.out.println();
                
	}

	public static boolean yesTo(String prompt)
	{
		//System.out.print(prompt + " (y/n)? ");
		String response = input.nextLine().trim().toLowerCase();
		while (!response.equals("y") && !response.equals("n")) 
		{
			//System.out.println("Please answer y or n.");
			//System.out.print(prompt + " (y/n)? ");
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
