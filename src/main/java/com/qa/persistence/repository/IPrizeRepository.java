package com.qa.persistence.repository;

import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Prize;

@Repository
public interface IPrizeRepository {

	public String createPrize(Prize Prize);

	public String getPrize(String accountNumber);

}
