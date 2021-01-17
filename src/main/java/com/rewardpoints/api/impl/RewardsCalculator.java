package com.rewardpoints.api.impl;

import java.math.BigDecimal;

public interface RewardsCalculator {
	public BigDecimal calculateRewardPoints(BigDecimal amount);
}
