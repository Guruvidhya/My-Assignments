package org.system;

public class AxisBank  extends BankInfo
{
	public void deposit() {
	System.out.println("Deposit account child class");
	//super.deposit();

	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();

	}

}
