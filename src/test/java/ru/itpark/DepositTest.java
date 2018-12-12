package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    @Test
    @DisplayName("Тесты на коректность расчетов")
    void calculateDeposit() {

        {
            Deposit deposit = new Deposit();
            double result = deposit.calculateDeposit(100_000, 92, 12);
            assertEquals(103_025, result);
        }

        {
            Deposit deposit = new Deposit();
            double result = deposit.calculateDeposit(10_000_000, 365, 7.5);
            assertEquals(10_750_000, result);
        }
    }
}