package com.dbi;

import java.util.Scanner;

import com.dbi.entity.Account;

public class DemoBank {
	
	private static String[] userInputValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Enter the AccNo : ");
		String accNo = sc.next();
		System.out.println("Enter the ifsc : ");
		String ifsc = sc.next();
		System.out.println("Enter the Branch : ");
		String branch = sc.next();
		System.out.println("Enter the pin : ");
		String pin = sc.next();
		System.out.println("Enter the phNo : ");
		String phNo = sc.next();
		
		String[] result = {name, accNo, ifsc, branch, pin, phNo};
		
		return result;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to DBI");
		
		Account[] database = new Account[2];
		
		String[] inputs = userInputValues();
		//Using Constructor
		Account arju = new Account(inputs[0], inputs[1], inputs[2], inputs[3], inputs[4], inputs[5]);
		
		System.out.println("Account Created Successfully!");
		
		inputs = userInputValues();
		//Using Setter
		Account ankan = new Account();
		ankan.setName(inputs[0]);
		ankan.setPhNo(inputs[5]);
		ankan.setAccNo(inputs[1]);
		ankan.setIfsc(inputs[2]);
		ankan.setBranch(inputs[3]);
		ankan.setPin(inputs[4]);
		
		database[0] = arju;
		database[1] = ankan;

	}

}
