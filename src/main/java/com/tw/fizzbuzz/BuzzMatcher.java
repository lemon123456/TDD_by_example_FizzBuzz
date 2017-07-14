package com.tw.fizzbuzz;

public class BuzzMatcher implements Matcher{
    public BuzzMatcher() {
    }

    @Override
    public boolean isMatched(int digit) {
        return digit % 5 == 0;
    }


    @Override
    public String getText() {
        return "buzz";
    }

    @Override
    public int priority() {
        return 2;
    }
}