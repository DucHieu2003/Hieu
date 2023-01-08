package com.patterns.strategy.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
