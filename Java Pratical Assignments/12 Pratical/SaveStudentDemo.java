import java.sql.SQLException;

public class SaveStudentDemo {
	public static void main(String[] args) throws SQLException {
		SaveStudent saveStudentObj = new SaveStudent();
		saveStudentObj.storeStudentDetail("Ram", 1, "MCA", "11/12/1998", "ram@gmail.com");
		saveStudentObj.storeStudentDetail("Sham", 2, "MBA", "5/3/1998", "shaml@gmail.com");
		saveStudentObj.storeStudentDetail("Aniket", 3, "MCA", "13/6/1998", "aniket@gmail.com");
		saveStudentObj.storeStudentDetail("Gaurav", 4, "BCA", "4/2/1999", "gaurav@gmail.com");
		saveStudentObj.storeStudentDetail("Vaibhav", 5, "BBA", "3/8/1999", "vaibhav@gmail.com");
	}
}
