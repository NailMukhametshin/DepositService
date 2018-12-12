package ru.itpark;

public class DepositService {
    public double calculateDeposit(int depositAmount, int depositTimeDays, double interestRate) {
        int daysInYear = 365;
        double result = Math.round(depositAmount + depositAmount * interestRate / 100 * depositTimeDays / daysInYear);
        return result;
    }
}
