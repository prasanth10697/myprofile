package com.basic;

public class savingaccount {
public static int annualInterestRate;
double savingbalance;
public void savingMonthlyInterest(double balance)
{
	this.savingbalance=balance;
}

	public void calculateMonthlyInterest(int annualInterestRate,double savingbalance) {
		double interst=(savingbalance * (annualInterestRate/100.0))/12;
				this.savingbalance=savingbalance+annualInterestRate;
				
	}
	
	public void modifyInterest(double savingBalance) {
		System.out.println(annualInterestRate);
		double interst=(savingBalance * annualInterestRate/100.0)/12;
				this.savingbalance=savingBalance+annualInterestRate;
				
	}
	
	public static void modifyInterstRate(int newValue) {
		
		annualInterestRate=newValue;
		System.out.println(annualInterestRate);
	}
	public void showBalance() {
		System.out.println("balance"+savingbalance);
	}
	public static void main(String[] args) {
		
		savingaccount sb1=new savingaccount();
		savingaccount sb2=new savingaccount();
		sb1.calculateMonthlyInterest(15,0000);
		sb1.showBalance();
		sb2.calculateMonthlyInterest(47,000);
		sb2.showBalance();
		sb1.modifyInterstRate(7);
		sb1.modifyInterest(7000);
		sb1.showBalance();
		sb1.modifyInterstRate(9);
		sb1.modifyInterest(9000);
		sb1.showBalance();
		}


	
}
