package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.qa.persistence.domain.Prize;
import com.qa.persistence.repository.PrizeRepository;
import com.qa.rest.PrizeEndpoint;
import com.qa.service.LengthChecker;
import com.qa.service.LetterChecker;
import com.qa.service.PrizeService;

public class PrizeGenTest {

	private LengthChecker lengCheck;
	private LetterChecker letCheck;
	private Prize prize;
	private PrizeService prizeService;
	private PrizeRepository prizeRepo;
	private PrizeEndpoint prizeEnd;

	@Before
	public void init() {
		lengCheck = Mockito.mock(LengthChecker.class);
		letCheck = Mockito.mock(LetterChecker.class);
		prize = Mockito.mock(Prize.class);
		prizeService = Mockito.mock(PrizeService.class);
		prizeRepo = Mockito.mock(PrizeRepository.class);
		prizeEnd = Mockito.mock(PrizeEndpoint.class);
	}

	@Test
	public void prizeClassPrizeTest() {

		prize.setPrize("You have won: £100");

		when(prize.getPrize()).thenReturn("You have won: £100");

		assertEquals("You have won: £100", prize.getPrize());

	}

	@Test
	public void prizeClassAccountNumberTest() {

		prize.setAccountNumber("A12345678");

		when(prize.getAccountNumber()).thenReturn("A12345678");

		assertEquals("A12345678", prize.getAccountNumber());

	}

	@Test
	public void checkLengthTest() {

		int expected = 1;

		String accountNumber = "A12345678";

		when(lengCheck.checkLength(accountNumber)).thenReturn(1);

		int actual = lengCheck.checkLength(accountNumber);

		assertEquals(expected, actual);

	}

	@Test
	public void checkLetterTest() {

		String expected = "You have won: £100";

		String accountNumber = "A12345678";

		when(letCheck.checkLetter(accountNumber)).thenReturn("You have won: £100");

		String actual = letCheck.checkLetter(accountNumber);

		assertEquals(expected, actual);

	}

	@Test
	public void serviceCreatePrizeTest() {

		String expected = "Prize created";

		Prize accountNumber = new Prize();

		accountNumber.setAccountNumber("A12345678");

		when(prizeService.createPrize(accountNumber)).thenReturn("Prize created");

		String actual = prizeService.createPrize(accountNumber);

		assertEquals(expected, actual);

	}

	@Test
	public void repoCreatePrizeTest() {

		String expected = "Prize created";

		Prize prize = new Prize();

		when(prizeRepo.createPrize(prize)).thenReturn("Prize created");

		String actual = prizeRepo.createPrize(prize);

		assertEquals(expected, actual);

	}

	@Test
	public void endpointCreateTest() {

		Prize accountNumber = new Prize();

		accountNumber.setAccountNumber("A12345678");

		Mockito.when(prizeEnd.createPrize(accountNumber)).thenReturn("Success");

		assertEquals("Success", prizeEnd.createPrize(accountNumber));

	}

	@Test
	public void endpointGetTest() {

		String accountNumber = "A12345678";

		Mockito.when(prizeEnd.getPrize(accountNumber)).thenReturn("Success");

		assertEquals("Success", prizeEnd.getPrize(accountNumber));

	}

}
