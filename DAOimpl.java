package com.bookstore.daoimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public  class DAOimpl implements DAO {
	
	static String url="jdbc:mysql://localhost:3306/book";
	static String username="root";
	static String password="roots";
	
	public void createTable() throws ClassNotFoundException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			String query= "create table bookstore(booktId int, bookname varchar(20),author varchar(20),bookprice double";
			PreparedStatement ps=con.prepareStatement(query);
			ps.executeUpdate();
					
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	
	public void insertbook() throws ClassNotFoundException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			String query="insert into bookstore values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, 101);
			ps.setString(2, "java");
			ps.setNString(3, "james");
			ps.setDouble(4,226.26);
			ps.executeUpdate();
			ps.setInt(1, 102);
			ps.setString(2, "General English");
			ps.setNString(3, "robert");
			ps.setDouble(4,220.26);
			ps.executeUpdate();
			ps.setInt(1, 103);
			ps.setString(2, "Science");
			ps.setNString(3, "josh");
			ps.setDouble(4,150.26);
			ps.executeUpdate();
			
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		
	}
	
	public void deletebook() throws ClassNotFoundException
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			String query = "delete from bookstore where bookId=103";
			PreparedStatement ps=con.prepareStatement(query);
			int noOfRowsDeleted = ps.executeUpdate();
			System.out.println("deleted row are "+ noOfRowsDeleted);
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void updatebook() throws ClassNotFoundException
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			String query = "update  bookstore set bookname? where bookId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, 104);
			ps.setString(2, "Social");
			ps.setNString(3, "ramana");
			ps.setDouble(4,135.26);
			
			int noOfRowsUpdated = ps.executeUpdate();
			System.out.println("updated row are "+ noOfRowsUpdated);
			
		}catch(SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public void getbookdetails() throws ClassNotFoundException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			String query = "select * from bookstore";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			System.out.println("details of bookstore");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getString(3)+""+rs.getDouble(4));
			}
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		DAOimpl bd = new DAOimpl();
		bd.createTable();
		bd.insertbook();
		bd.updatebook();
		bd.deletebook();
		bd.getbookdetails();
		

	}


	

}
