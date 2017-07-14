package com.tw.fizzbuzz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Printer {


    private List<Matcher> matchers = Arrays.asList(Matcher.whizz(), Matcher.fizz(), Matcher.buzz());

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
            if (DigitMatcher.fizz().isMatched(digit)) {
                return "fizz";
            }
            if (DigitMatcher.buzz().isMatched(digit)) {
                return "buzz";
            }
            if (DigitMatcher.whizz().isMatched(digit)) {
                return "whizz";
            }
        }
        return result.isEmpty()? String.valueOf(number) : result;
    }

}