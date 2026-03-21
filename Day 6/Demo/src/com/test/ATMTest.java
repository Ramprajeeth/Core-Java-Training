package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.abcd.ATM;

public class ATMTest {
	@Test
	public void testWithdraw() {
		ATM atm = new ATM(5000);
		int remaining = atm.withdraw(2000);
		assertEquals(3000, remaining);

	}

	@Test
	public void testWithdrawMoreThanbalance() {
		ATM atm = new ATM(5000);
		int rem = atm.withdraw(7000);
		assertEquals(5000, rem);
	}

}
