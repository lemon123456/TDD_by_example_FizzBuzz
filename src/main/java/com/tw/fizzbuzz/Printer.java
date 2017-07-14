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
        String result = "";
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                result += matcher.getText();
            }
        }

        String[] digits = String.valueOf(number).split("");
        for (String digit : digits) {
            for (DigitMatcher digitMatcher : digitMatchers) {
                if (digitMatcher.isMatched(digit)) {
                    return digitMatcher.getText();
                }
            }
        }
        return result.isEmpty()? String.valueOf(number) : result;
    }

}