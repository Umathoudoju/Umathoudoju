package com.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlistdatabase {
	public static void main(String[] args) {
		String myDriver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/db?characterEncoding=utf8";
		String username = "root";
		String password = "uma@12345";

		try {
			Class.forName(myDriver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String sql = "select * from Details";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			LinkedList<Integer> dataList = new LinkedList<Integer>();
			while (resultSet.next()) {
				dataList.add(resultSet.getInt(1));
			}
			connection.close();
			for (int value : dataList) {
				System.out.println("data from linked list ==> " + value);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}