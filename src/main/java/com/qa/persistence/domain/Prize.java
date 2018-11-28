package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prize {

	@Id
	private String Id;
	private String accountNumber;
	private String Prize;


	public Prize() {

	}

	public Prize(String accountNumber, String prize) {
		this.Id = accountNumber;
		this.accountNumber = accountNumber;
		this.Prize = prize;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public String setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this.accountNumber;
	}


	public String getPrize() {
		return Prize;
	}

	public String setPrize(String prize) {
		this.Prize = prize;
		return this.Prize;
	}


}
