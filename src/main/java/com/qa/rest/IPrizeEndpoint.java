package com.qa.rest;

import com.qa.persistence.domain.Prize;

public interface IPrizeEndpoint {

	public String createPrize(Prize accountNumber);

	public String getPrize(String accountNumber);

}
