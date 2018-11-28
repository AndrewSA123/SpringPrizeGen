package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Prize;
import com.qa.service.IPrizeService;

@RestController
@RequestMapping("${base_endpoint}")
public class PrizeEndpoint {

	@Autowired
	IPrizeService service;

	@PostMapping("${create_endpoint}")
	public String createPrize(@RequestBody Prize accountNumber) {
		return service.createPrize(accountNumber);
	}

	@GetMapping("${get_endpoint}")
	public String getPrize(@PathVariable("accountNumber") String accountNumber) {
		return service.getPrize(accountNumber);
	}

}
