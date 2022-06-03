package com.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner scn=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data=new HashMap<Integer,Integer>();
	
	
	//validation login customer number and pin
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(1234567, 1234);
				data.put(5678910, 5678);
				data.put(7891011, 7891);
				System.out.println("Wellcome to the ATM ");
				System.out.println("Enter your Customer No");
				setCustomerNumber(scn.nextInt());
				System.out.println("Enter your Pin");
				setPinNumber(scn.nextInt());
			}
				
				
				//setCustomernumber(menuInput)
				
				catch(Exception e) {
					System.out.println("Invalid charector");
					x=2;
				}
				for(Entry<Integer, Integer> entry:data.entrySet()) {
					if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
						getAccountType();
					}
				}
				System.out.println("Wrong Customer Number or Pin Number");
		}while(x==1);
	}
	
	
	//display account type menu with selection
	
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Checking Account ");
		System.out.println("Type 2 - Saving Account ");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice: ");
		int selection=scn.nextInt();
		
		switch(selection) {
		case 1:
			getChicking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for visiting us");
			break;
			default:
				System.out.println("Invalid Choice");
				getAccountType();
		}
		
	}
	
	//display checking Account menu with selection
	
	public void getChicking() {
		System.out.println("CHECKING ACCOUNT");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		int selection=scn.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: "+ moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDeposite();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for Visiting us");
			break;
			default:
				System.out.println("Invalid choice");
				getChicking();
		}
	}
	
	//Display saving account menu with selection
	
	public void getSaving() {
		System.out.println("SAVING ACCOUNT");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		int selection=scn.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositeInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for Visiting us");
			break;
			default:
				System.out.println("Invalid choice");
				getSaving();
		}
	}
}
