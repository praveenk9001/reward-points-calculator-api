package com.rewardpoints.api.impl;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RewardsCalculatorImpl implements RewardsCalculator {

	private static final Logger logger = LoggerFactory.getLogger(RewardsCalculatorImpl.class);

	private static final BigDecimal FIFTY = BigDecimal.valueOf(50);
	private static final BigDecimal HUNDRED = BigDecimal.valueOf(100);
	private static final BigDecimal TWO = BigDecimal.valueOf(2);

	@Override
	public BigDecimal calculateRewardPoints(BigDecimal amount) {
		logger.debug(String.format("Transaction Amount : %s", NumberFormat.getCurrencyInstance(Locale.US).format(amount)));

		BigDecimal rewardPoints = BigDecimal.ZERO;
		if (amount == null) {
			return rewardPoints;
		}
		// If the amount is greater than 100, add points.
		if (amount.compareTo(HUNDRED) == 1) {
			// For every dollar greater than 100, give 2 points per dollar spent.
			rewardPoints = rewardPoints.add(amount.subtract(HUNDRED).multiply(TWO));
			// Also add 1 point for the first 50 dollars.
			rewardPoints = rewardPoints.add(FIFTY);
		}
		// If we are here, amount must be less than 100, but if greater than 50, add points.
		else if (amount.compareTo(FIFTY) == 1) {
			// Give 1 point for every dollar spent above 50 dollars.
			rewardPoints = rewardPoints.add(amount.subtract(FIFTY));
		}

		logger.debug(String.format("Reward Points : %s", rewardPoints.toPlainString()));
		return rewardPoints;
	}

}

