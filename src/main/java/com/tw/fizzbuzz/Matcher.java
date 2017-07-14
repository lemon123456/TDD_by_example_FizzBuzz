package com.tw.fizzbuzz;

public interface Matcher extends Comparable {
    boolean isMatched(int digit);

    String getText();

    int priority();

    @Override
    default int compareTo(Object o){
        Matcher other = (Matcher) o;
        return Integer.compare(priority(), other.priority());
    }
}
