package lotto.service;

public class CalculateProfitRate {
    public static float calculateProfitRate(int totalProfit, int t) {
        int p = t * 1000;
        return (float) totalProfit / p * 10;
    }
}
