package ru.itpark;

public class Deposit {
    public double calculateDeposit(int depositAmount, int depositTimeDays, double interestRate) {
        int daysInYear = 365;
        double result = depositAmount + depositAmount * interestRate / 100 * depositTimeDays / daysInYear;
        return result;
    }
}
