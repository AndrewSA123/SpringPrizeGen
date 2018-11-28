package com.qa.service;

import com.qa.constants.PrizeConstants;

public class LetterChecker {

	LengthChecker length = new LengthChecker();

	public String checkLetter(String accountNumber) {
		switch (accountNumber.charAt(0)) {
		case 'A':
			return PrizeConstants.HAVE_WON
					+ Integer.toString((int) (Math.pow(PrizeConstants.POWER, length.checkLength(accountNumber))
							* PrizeConstants.PRIZE_AMOUNT_A));
		case 'B':
			return PrizeConstants.HAVE_WON
					+ Integer.toString((int) (Math.pow(PrizeConstants.POWER, length.checkLength(accountNumber))
							* PrizeConstants.PRIZE_AMOUNT_B));
		}
		return PrizeConstants.NO_PRIZE;

	}

}
