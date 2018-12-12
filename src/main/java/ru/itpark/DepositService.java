package ru.itpark;

public class DepositService {
    public int calculateDeposit(int depositAmount, int depositTimeDays, double interestRate) {
        int daysInYear = 365;
        return (int) Math.round(depositAmount + depositAmount * interestRate / 100 * depositTimeDays / daysInYear);
    }
}
