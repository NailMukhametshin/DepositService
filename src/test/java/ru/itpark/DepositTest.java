package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    @Test
    void calculateDeposit() {
        // Some changes
        {
            Deposit deposit = new Deposit();
            double i = deposit.calculateDeposit(100_000, 92, 12);
            assertEquals(103_025, i);
        }

        {
            Deposit deposit = new Deposit();
            double i = deposit.calculateDeposit(10_000_000, 365, 7.5);
            assertEquals(10_750_000, i);
        }
    }
}