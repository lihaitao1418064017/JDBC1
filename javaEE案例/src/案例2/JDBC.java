package ����2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//�����������ݿ�
public class JDBC {
	public static void connection() throws ClassNotFoundException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/stc", "root", "123456");
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}
}
