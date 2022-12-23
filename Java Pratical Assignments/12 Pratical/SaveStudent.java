import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveStudent {
	
	JdbcConnection jdbcObj = new JdbcConnection();

	public void storeStudentDetail(String Name,int RollNo,String Course,String DOB,String email) throws SQLException {
		Connection con = jdbcObj.getConnection();
		PreparedStatement stmtt = null;
		try {
			stmtt = con.prepareStatement("insert into student_details values(?,?,?,?,?)");
			stmtt.setString(1, Name);
			stmtt.setInt(2, RollNo);
			stmtt.setString(3, Course);
			stmtt.setString(4, DOB);
			stmtt.setString(5, email);

			int i = stmtt.executeUpdate();
			System.out.println(i + " records inserted");
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			stmtt.close();
		}

	}
}
