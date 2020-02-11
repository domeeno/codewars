package com.company;

public class FactorialTrailingZeroCounter {
    public static int zeros(int n) {
        int zeroes = 0;

        for(int i = 5; n / i >= 1; i *= 5){
            zeroes += n / i;
        }

        return zeroes;
    }
}
