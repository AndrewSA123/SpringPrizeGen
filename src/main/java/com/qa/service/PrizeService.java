package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.constants.PrizeConstants;
import com.qa.persistence.domain.Prize;
import com.qa.persistence.repository.PrizeRepository;

public class PrizeService implements IPrizeService {

	private LetterChecker lt = new LetterChecker();
	private Prize newPrize;
	private String prize;

	@Autowired
	private PrizeRepository repo;

	@Override
	public String createPrize(Prize accountNumber) {
		newPrize = new Prize(accountNumber.getAccountNumber(), lt.checkLetter(accountNumber.getAccountNumber()));
		repo.createPrize(newPrize);
		return PrizeConstants.CREATE_PRIZE;
	}

	@Override
	public String getPrize(String accountNumber) {
		prize = lt.checkLetter(accountNumber);
		return prize;
	}

	public void setRepo(PrizeRepository repo) {
		this.repo = repo;
	}

}
