package com.qa.service;

public class LengthChecker {

	public int checkLength(String accountNumber) {
		switch (accountNumber.length()) {
		case 7:
			return 0;
		case 9:
			return 1;
		case 11:
			return 2;
		}
		return 0;
	}

}
