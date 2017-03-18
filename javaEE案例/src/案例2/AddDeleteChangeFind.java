package 案例2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddDeleteChangeFind {
	//增
	public void Add() {
		try {
			// 建立连接
			Connection connection = DBHelper.createConnection();
			// 查询语句
			String sqlString = "INSERT INTO course_table(name,cost) VALUES(?,?)";
			// 创建执行sql语句
			PreparedStatement preparedStatement = connection
					.prepareStatement(sqlString);
			connection.close();
		} catch (Exception e) {
			throw new RuntimeException("数据错误！");
		}

	}
	//删
	public void delete() {
		try {
			// 建立连接
			Connection connection = DBHelper.createConnection();
			// 查询语句
			String sqlString = "DELETE from course_table where ID=5";
			// 创建执行sql语句
			PreparedStatement preparedStatement = connection
					.prepareStatement(sqlString);
			connection.close();
		} catch (Exception e) {
			throw new RuntimeException("数据错误！");
		}

	}
	//改
	public void change() {
		try {
			Connection connection = DBHelper.createConnection();
			String changeSql = "UPDATE  course_table set name=lihaitao, cost=45 where ID=?";
			// 创建执行sql语句
			PreparedStatement preparedStatement = connection
					.prepareStatement(changeSql);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//查
	public void Find() {
		try {
			Connection connection = DBHelper.createConnection();
			// 查询语句
			String sqlString = "SELECT * FROM course_table";
			// 创建执行sql语句
			PreparedStatement preparedStatement = connection
					.prepareStatement(sqlString);
			// 发送语句 查询并返回结果
			ResultSet resultSet = preparedStatement.executeQuery();// 查询语句
			while (resultSet.next()) {
				int kj = resultSet.getInt("ID");
				String name = resultSet.getString("name");
				int cost = resultSet.getInt("cost");
			}
		} catch (Exception e) {
			throw new RuntimeException("数据错误！");
		}

	}
}
