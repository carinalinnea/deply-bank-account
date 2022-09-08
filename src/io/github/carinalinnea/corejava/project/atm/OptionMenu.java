package io.github.carinalinnea.corejava.project.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException {
		int x = 1;
		do {
			try {
				data.put(952141, 191904);
				data.put(989947, 71976);
				
				System.out.println("Welcome to my Automation Project!");
				System.out.println("Please enter your user number");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Please enter your PIN Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). Only Numbers." + "\n");
				x = 2;
			}
			/*for(Map.Entry<Integer, Integer> it : data.entrySet()) {
				if(it.getKey()==getCustomerNumber() && it.getValue()==getPinNumber) {
					getAccountType();
				}
			}*/
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if (data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			} else 
				System.out.println("\n" + "Wrong user number or Pin number" + "\n");
			} while (x == 1);
	}
	
	public void getAccountType() {
		System.out.println("Select your Account type: ");
		System.out.println(" Type 1 - Checking Account");
		System.out.println(" Type 2 - Saving Account");
		System.out.println(" Type 3 - Exit");
		
		int selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this Automation, have a nice day. \n");
			break;
		default:
			System.out.println("`\n" + "Invalid choice." + "\n");
			getAccountType();
		}
	}
	public void getChecking() {
		System.out.println("Checcking Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Funds");
		System.out.println(" Type 3 - Deposit Funds");
		System.out.println(" Type 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Checking Account balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this Automation, have a nice day.");
			break;
		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getChecking();
		}
	}
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - WithDraw Funds");
		System.out.println(" Type 3 - Deposit Funds");
		System.out.println(" Type 4 - Exit");
		System.out.println("Choise: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
			case 1:
				System.out.println("Saving Account balance: " + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using this Automation, have a nice day.");
				break;
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getChecking();
		}
	
	}

	
	}

