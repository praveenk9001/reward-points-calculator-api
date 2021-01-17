package com.rewardpoints;


import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

import com.rewardpoints.api.impl.RewardsCalculator;
import com.rewardpoints.api.impl.RewardsCalculatorImpl;

@SpringBootTest
public class RewardsCalculatorTest {
	
	RewardsCalculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new RewardsCalculatorImpl();
	}

	@Test
	public void testAmount_NotGreaterThan_50_ShouldYield_ZeroPoints() {
		BigDecimal rewardPoints = calculator.calculateRewardPoints(BigDecimal.valueOf(50));
		assertTrue(BigDecimal.ZERO.compareTo(rewardPoints) == 0);
	}
	
	@Test
	public void testAmount_NotGreaterThan_100_ShouldYield_Points() {
		BigDecimal rewardPoints = calculator.calculateRewardPoints(BigDecimal.valueOf(100));
		assertTrue(BigDecimal.valueOf(50).compareTo(rewardPoints) == 0);
	}
	
	@Test
	public void testAmount_GreaterThan_100_shouldAlsoYield_Points() {
		BigDecimal rewardPoints = calculator.calculateRewardPoints(BigDecimal.valueOf(120));
		assertTrue(BigDecimal.valueOf(90).compareTo(rewardPoints) == 0);
	}

}

