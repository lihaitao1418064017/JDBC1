package ����2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddDeleteChangeFind {
	//��
	public void Add() {
		try {
			// ��������
			Connection connection = DBHelper.createConnection();
			// ��ѯ���
			String sqlString = "INSERT INTO course_table(name,cost) VALUES(?,?)";
			// ����ִ��sql���
			PreparedStatement preparedStatement = connection
					.prepareStatement(sqlString);
			connection.close();
		} catch (Exception e) {
			throw new RuntimeException("���ݴ���");
		}

	}
	//ɾ
	public void delete() {
		try {
			// ��������
			Connection connection = DBHelper.createConnection();
			// ��ѯ���
			String sqlString = "DELETE from course_table where ID=5";
			// ����ִ��sql���
			PreparedStatement preparedStatement = connection
					.prepareStatement(sqlString);
			connection.close();
		} catch (Exception e) {
			throw new RuntimeException("���ݴ���");
		}

	}
	//��
	public void change() {
		try {
			Connection connection = DBHelper.createConnection();
			String changeSql = "UPDATE  course_table set name=lihaitao, cost=45 where ID=?";
			// ����ִ��sql���
			PreparedStatement preparedStatement = connection
					.prepareStatement(changeSql);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//��
	public void Find() {
		try {
			Connection connection = DBHelper.createConnection();
			// ��ѯ���
			String sqlString = "SELECT * FROM course_table";
			// ����ִ��sql���
			PreparedStatement preparedStatement = connection
					.prepareStatement(sqlString);
			// ������� ��ѯ�����ؽ��
			ResultSet resultSet = preparedStatement.executeQuery();// ��ѯ���
			while (resultSet.next()) {
				int kj = resultSet.getInt("ID");
				String name = resultSet.getString("name");
				int cost = resultSet.getInt("cost");
			}
		} catch (Exception e) {
			throw new RuntimeException("���ݴ���");
		}

	}
}
