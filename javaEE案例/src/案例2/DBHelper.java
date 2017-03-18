package 案例2;

import java.sql.Connection;
import java.sql.DriverManager;
//数据库管理对象
public class DBHelper {
	//数据连接
	public static Connection createConnection()throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		// 建立连接
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/stc", "root", "123456");
		return connection;
	}
}
