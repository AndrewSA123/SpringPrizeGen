package com.qa.service;

import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Prize;

@Service
public interface IPrizeService {

	public String createPrize(Prize accountNumber);

	public String getPrize(String accountNumber);

}
