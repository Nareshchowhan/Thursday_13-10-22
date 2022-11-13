package com.Bank;

public class BankDetails {
	private Bank[] account;
	private int entry;
	
	BankDetails()
	{
		account=new Bank[4];
				
	}
public void checkBalance(Bank input)
{
	if(entry<account.length) 
	{
		account[entry]=input; 
		entry++; 
		
		if(input.getBalance()<(1000))
		System.out.println("Low Balance Account Details are :"+  input.getName() + ", Rs." + input.getBalance()); 
	}
}
	public static void main(String[] args) {
		
		Bank b1 = new Bank("rohit",768543,5455.90);
		Bank b2 = new Bank("rahul",768546,127.75);
		Bank b3 = new Bank("kohli",768541,12453.96);
		Bank b4 = new Bank("sky",768452,85654);
		
		BankDetails myBank = new BankDetails();
		myBank.checkBalance(b1);
		myBank.checkBalance(b2);
		myBank.checkBalance(b3);
		myBank.checkBalance(b4);
	}
	
}
