package com.tw.fizzbuzz;

public class FizzBuzzMatcher implements Matcher {


    private final Matcher[] matchers;

    FizzBuzzMatcher(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean isMatched(int digit) {
        for (Matcher matcher : matchers) {
            if (!matcher.isMatched(digit)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getText() {
        return "fizzbuzz";
    }

    @Override
    public int priority() {
        return 0;
    }
}