package ����2;

import java.sql.Connection;
import java.sql.DriverManager;
//���ݿ�������
public class DBHelper {
	//��������
	public static Connection createConnection()throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		// ��������
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/stc", "root", "123456");
		return connection;
	}
}
