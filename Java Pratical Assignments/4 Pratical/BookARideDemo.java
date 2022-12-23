public class BookARideDemo {
	public static void main(String args[]) throws RideOverBookedException{
		try 
		{
			BookARide rideObj = new BookARide();
			rideObj.bookSeat(5);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
