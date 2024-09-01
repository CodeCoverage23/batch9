package com.basic.exception;

public class UserDefineExceptionDemo1 {

	static double availableBalance = 10000.0;

	public static void main(String[] args) throws FundNoTFoundException {

		double transferableBalance = 12000;

		if (availableBalance > transferableBalance) {
			System.out.println("Money has been transfered...");
		} else {
			throw new FundNoTFoundException("Insufficient Balance");
		}
	}

}
