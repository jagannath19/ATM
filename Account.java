package com.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner scn=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	
	//set the customer no
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	
	//get the customer no
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	//set pin number
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	
	//get the pinNumber
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	
	//get check account Balance
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	
	//get saving account balance
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	//calculate checking account withdraw
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance=checkingBalance-amount;
		return checkingBalance;
	}
	
	
	//calculate saving account withdraw
	
	public double calcSavingWithdraw(double amount) {
		savingBalance-=amount;
		return savingBalance;
	}
	
	
	//calculate checking account deposit
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance+=amount;
		return checkingBalance;
	}
	
	//calculate saving account deposit
	
	public double calcSavingDeposit(double amount) {
		savingBalance+=amount;
		return savingBalance;
	}
	
	//customer checking account withdraw input
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance; " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdeaw from checking Account: ");
		double amount=scn.nextDouble();
		
		if((checkingBalance-amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: "+ moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balance cannot be negative."+ "\n");
		}
	}
	
	
	//customer saving account withdraw input
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account: ");
		double amount=scn.nextDouble();
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance : "+ savingBalance+"\n");
		}
		else
			System.out.println("Balance cannot be negative.");
	}
	
	
	//customer checking account deposit input
	
	public void getCheckingDeposite() {
		System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking Account: ");
		double amount=scn.nextDouble();
		
		if((checkingBalance+amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance) );
			}
			else
				System.out.println("Balance cannot be negative");
			
		}
		
		
		//customer saving account deposit input
		
		public void getSavingDepositeInput() {
			System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to deposit from saving Account: ");
			double amount=scn.nextDouble();
			if((savingBalance+amount)>=0) {
				calcSavingDeposit(amount);
				System.out.println("New Saving account balance: "+moneyFormat.format(savingBalance));
			}
			else {
				System.out.println("Balance cannot be negative.");
		}
	}
	
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
}
