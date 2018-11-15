package com.example.RDS;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



import org.springframework.stereotype.Component;

@Component
public class Helper {
	
	public String dbConnect(String name, String uid, String pass) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		Statement stmt=con.createStatement();
		String sql= "create database " +name;
		stmt.executeUpdate(sql);
		
		
		
		
		
		
		
		return "SUCCESS";
	}
	

}
