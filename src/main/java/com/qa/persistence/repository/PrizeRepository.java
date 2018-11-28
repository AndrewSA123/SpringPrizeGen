package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.constants.PrizeConstants;
import com.qa.persistence.domain.Prize;

@Transactional(SUPPORTS)
public class PrizeRepository implements IPrizeRepository {

	@Autowired
	private EntityManager em;

	@Override
	@Transactional(REQUIRED)
	public String createPrize(Prize prize) {
		if (prize != null) {
			em.persist(prize);
			return PrizeConstants.CREATE_PRIZE;
		}
		return PrizeConstants.PRIZE_NOT_FOUND;
	}

	@Override
	public String getPrize(String accountNumber) {

		Query q = em.createQuery("Select p FROM Prize p");

		Collection<Prize> prizes = (Collection<Prize>) q.getResultList();

		for (Prize p : prizes) {
			if (p.getAccountNumber().equals(accountNumber)) {
				return p.getPrize();
			}
		}

		return PrizeConstants.PRIZE_NOT_FOUND;
	}

}
