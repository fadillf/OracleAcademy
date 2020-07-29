/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBank;

/**
 *
 * @author Fadillah
 */
public abstract class AbstractBankAccount {
    String accountname;
	    int accountnum;
	    int balance;
	    
	    //default constructor for Account
	    AbstractBankAccount()
	    {
	    	this.accountname="EMPTY";
	    	this.accountnum=0;
	    	this.balance=0;
	    }
	    
	    //overloaded constructor for Account
	    AbstractBankAccount(String name, int num,int amt)
	    {
	            accountname=name;
	    	    accountnum=num;
	            balance=amt;
	    }
	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
	    	    balance=balance+amt;
	    }
	    //make a withdrawal from the balance
	    public void withdraw(int amt)
	    {
	    	    balance=balance-amt;
	    }
	    //modifier to set the accountname
	    public void setaccountname(String name)
	    {
	    	    accountname = name;
	    }
	  //modifier to set the accountnumber
	    public void setaccountnum(int num)
	    {
	    	    accountnum = num;
	    }
	  //modifier to set the balance
	    public void setbalance(int num)
	    {
	    	    balance = num;
	    }
	  //accessor to get the accountname
	    public String getaccountname ( ) {
	    	 
	    	return accountname;
	    }
	    
	  //accessor to get the accountnumber
	    public int getaccountnum ( ) {
	   	 
	    	return accountnum;
	    }
	  //accessor to get the account balance
	    public int getbalance ( ) {
	      	 
	    	return balance;
	    }
	    
	    //print method 
	    public void print() {
	        System.out.println(accountname + " " + accountnum + " " + balance);
	      }
}
