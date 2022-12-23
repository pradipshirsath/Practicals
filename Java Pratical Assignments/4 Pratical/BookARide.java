//	Write your own user defined exception class, RideOverBooked.
class RideOverBookedException extends Exception {
	public RideOverBookedException() {
		System.out.println("Total number of booking exceeds 4");
	}
}

//	You are running a shared cab service. Write a class, BookARide.
public class BookARide {
//	In this class write the method, bookSeat(int totalNoOfBooking).
//	In bookSeat() if totalNoOfBooking exceeds 4 throw RideOverBooked exception.
	public void bookSeat(int totalNoOfBooking) throws RideOverBookedException {
		if (totalNoOfBooking > 4) {
			throw new RideOverBookedException();
		} 
		else {
			System.out.println("Your cab is on the way");
		}
	}
}
