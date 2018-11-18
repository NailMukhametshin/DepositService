package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    @org.junit.jupiter.api.Test
    void calculateDeposit() {
        {
            Deposit deposit = new Deposit();
            double i = deposit.calculateDeposit(100_000, 92, 12);
            assertEquals(103_024.65753424658, i); //согласно сайту 103_025р, из за округления
        }

        {
            Deposit deposit = new Deposit();
            double i = deposit.calculateDeposit(10_000_000, 365, 7.5);
            assertEquals(10_750_000, i);
        }
    }
}