package com.tw.fizzbuzz;

class DigitMatcher {

    private String text;
    private String digit;

    private DigitMatcher(String digit, String text) {
        this.text = text;
        this.digit = digit;
    }

    static DigitMatcher fizz() {
        return new DigitMatcher("3", "fizz");
    }

    static DigitMatcher buzz() {
        return new DigitMatcher("5", "buzz");
    }

    static DigitMatcher whizz() {
        return new DigitMatcher("7", "whizz");
    }

    String getText() {
        return this.text;
    }

    boolean isMatched(String digit) {
        return digit.equals(this.digit);
    }


}