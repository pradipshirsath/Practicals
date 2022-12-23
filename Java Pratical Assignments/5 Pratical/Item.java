

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Item {
	
	JdbcConnection jdbcObj = new JdbcConnection();

	public void storeDetailInItem(int id, String productName, int quantity, int price) throws SQLException {
		Connection con = jdbcObj.getConnection();
		PreparedStatement stmtt = null;
		try {
			stmtt = con.prepareStatement("insert into Items values(?,?,?,?)");

			stmtt.setInt(1, id);
			stmtt.setString(2, productName);
			stmtt.setInt(3, quantity);
			stmtt.setInt(4, price);

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
	
//	Find out the price of the item whose itemId is passed to the query.
//	Make use of prepared statements to achieve this.
	public void findItemPrice(int itemId) throws SQLException {
		PreparedStatement stmtt = null;
		Connection con = jdbcObj.getConnection();
		try {
			
			stmtt = con.prepareStatement("select itemPrice from Items where itemId = ?");
			stmtt.setInt(1, itemId);
			ResultSet rs = stmtt.executeQuery();
			while (rs.next()) {
				System.out.println("The Price of Item Id : " + itemId + " is Rs." + rs.getInt(1));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			stmtt.close();
		}
	}
}
