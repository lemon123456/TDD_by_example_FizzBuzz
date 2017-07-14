package com.tw.fizzbuzz;

class DigitMatcher {

    private String digit;

    private DigitMatcher(String digit) {
        this.digit = digit;
    }

    static DigitMatcher fizz() {
        return new DigitMatcher("3");
    }

    static DigitMatcher buzz() {
        return new DigitMatcher("5");
    }

    static DigitMatcher whizz() {
        return new DigitMatcher("7");
    }

    boolean isMatched(String digit) {
        return digit.contains(this.digit);
    }


}