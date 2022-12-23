//	Write your own user defined exception class, RideOverBooked.
class NotLeapYearException extends Exception {
	public NotLeapYearException() {
		System.out.println("User defined exception");
	}
}



public class CustomException {
	public void leapOrNot(long year) throws NotLeapYearException{
		if (year != 0) 
		{
			if (year % 400 == 0)
			{
				System.out.println(year + " is a leap year");
			}
			else if (year % 100 == 0)
			{
				System.out.println(year + " is not a leap year");
				throw new NotLeapYearException();
			}
			else if (year % 4 == 0)
			{
				System.out.println(year + " is a leap year");
			}
			else
			{
				System.out.println(year + " is not a leap year");
				throw new NotLeapYearException();
			}
		} 
		
		else
		{
			System.out.println("Year zero does not exist ");
		}
	}
	
}
