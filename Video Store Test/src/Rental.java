public class Rental 
{
	int numberOfDays;
	int frequentRenterPoints;
	String movieType;

	public Rental(int days, String movieType) 
	{
		this.numberOfDays = days;
		this.movieType = movieType;
		this.frequentRenterPoints = getFrequentRenterPoints(numberOfDays);
	}

	public int getFrequentRenterPoints(int days)
	{
		if(movieType.equals("New Release"))
		{
			if(days > 1 && days <= 3)
			{
				return 10;
			}
			else if(days > 3 && days <= 5)
			{
				return 20;
			}
			else if(days > 5)
			{
				return 30;
			}
			else
			{
				return 0;
			}
		}
		return 0;
	}

	public int getNumberOfDays() 
	{
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) 
	{
		this.numberOfDays = numberOfDays;
	}

	public int getFrequentRenterPoints()
	{
		return frequentRenterPoints;
	}

	public void setFrequentRenterPoints(int frequentRenterPoints)
	{
		this.frequentRenterPoints = frequentRenterPoints;
	}

	public String getMovieType() 
	{
		return movieType;
	}

	public void setMovieType(String movieType) 
	{
		this.movieType = movieType;
	}
}