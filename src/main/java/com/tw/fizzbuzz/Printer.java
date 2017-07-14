package com.tw.fizzbuzz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Printer {

    private final Matcher buzzMatcher = Matcher.buzz();
    private final Matcher fizzMatcher = Matcher.fizz();
    private final Matcher whizzMatcher = Matcher.whizz();

    private List<Matcher> matchers = Arrays.asList(whizzMatcher, fizzMatcher, buzzMatcher);

    Printer() {
        //noinspection unchecked
        Collections.sort(matchers);
    }

    String fizzbuzz(int digit) {
        String result = "";
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(digit)) {
                result += matcher.getText();
            }
        }
        return result.isEmpty()? String.valueOf(digit) : result;
    }

}