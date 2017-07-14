package com.tw.fizzbuzz;

public class Matcher implements Comparable {
    private int number;
    private String text;
    private int priority;


    Matcher(int number, String text, int priority) {
        this.number = number;
        this.text = text;
        this.priority = priority;
    }

    static Matcher fizz() {
        return new Matcher(3, "fizz", 0);
    }

    static Matcher buzz() {
        return new Matcher(5, "buzz", 1);
    }

    public boolean isMatched(int digit) {
        return digit % number == 0;
    }

    public String getText() {
        return text;
    }

    public int priority() {
        return priority;
    }

    @Override
    public int compareTo(Object o){
        Matcher other = (Matcher) o;
        return Integer.compare(priority(), other.priority());
    }
}
