package com.Bank;

public class Bank {
	private String name;
	private int accountNum;
	private double balance;
	

Bank()
{
	super();
}
Bank(String n,int a,double b)
{
	this.name=n;
	this.accountNum=a;
	this.balance=b;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccountNum() {
	return accountNum;
}
public void setAccountNum(int accountNum) {
	this.accountNum = accountNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
