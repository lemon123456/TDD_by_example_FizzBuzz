package com.tw.fizzbuzz;

public class FizzMatcher implements Matcher {
    FizzMatcher() {
    }

    @Override
    public boolean isMatched(int digit) {
        return digit % 3 == 0;
    }

    @Override
    public String getText() {
        return "fizz";
    }

    @Override
    public int priority() {
        return 1;
    }


}