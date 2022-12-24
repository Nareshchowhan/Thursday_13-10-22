package com.bookstore.daoimp;



interface  DAO {
	
		void createTable() throws ClassNotFoundException;
		void insertBook();
		void updatebook() throws ClassNotFoundException;
		
	    void deleteBook() throws ClassNotFoundException;
	    void getbookdetails() throws ClassNotFoundException;
		

	}



