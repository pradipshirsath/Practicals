public class CustomExceptionDemo {
	public static void main(String[] args) throws NotLeapYearException {
		CustomException customException = new CustomException();
		long year = 2001;
		customException.leapOrNot(year);
	}
}
