import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) throws SQLException {
		Item obj = new Item();
		//obj.storeDetailInItem(9,"Battery",3,12);
		obj.findItemPrice(9);
	}
}
