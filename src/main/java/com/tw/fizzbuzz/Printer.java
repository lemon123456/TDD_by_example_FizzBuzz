package com.tw.fizzbuzz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Printer {
    private List<Matcher> matchers = Arrays.asList(Matcher.whizz(), Matcher.fizz(), Matcher.buzz());
    private List<DigitMatcher> digitMatchers = Arrays.asList(DigitMatcher.fizz(), DigitMatcher.buzz(), DigitMatcher.whizz());

    Printer() {
        //noinspection unchecked
        Collections.sort(matchers);
    }

    String fizzbuzz(int number) {
        String digitMatcher = getDigitMatcherResult(number);
        if (!digitMatcher.isEmpty()) return digitMatcher;

        String result = getModMatcherResult(number);
        return result.isEmpty()? String.valueOf(number) : result;
    }

    private String getDigitMatcherResult(int number) {
        String[] digits = String.valueOf(number).split("");
        for (String digit : digits) {
            for (DigitMatcher digitMatcher : digitMatchers) {
                if (digitMatcher.isMatched(digit)) {
                    return digitMatcher.getText();
                }
            }
        }
        return "";
    }

    private String getModMatcherResult(int number) {
        String result = "";
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                result += matcher.getText();
            }
        }
        return result;
    }

}