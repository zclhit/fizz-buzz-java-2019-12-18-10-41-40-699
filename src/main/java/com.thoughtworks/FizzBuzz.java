package com.thoughtworks;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";

    public String say(int position) {
        if (isContains(position, "5")) {
            return processNormal(position);
        }
        if (isContains(position, "3")) {
            return FIZZ;
        }
        return processNormal(position);
    }

    private boolean isContains(int position, String s) {
        return String.valueOf(position).contains(s);
    }

    private String processNormal(int position) {
        StringBuilder resultStr = new StringBuilder();
        if (canBeExactedDividedBy(position, 3)) {
            resultStr.append(FIZZ);
        }
        if (canBeExactedDividedBy(position, 5)) {
            resultStr.append("Buzz");
        }
        if (canBeExactedDividedBy(position, 7)) {
            resultStr.append("Whizz");
        }
        if (resultStr.length() == 0) {
            return String.valueOf(position);
        }
        return resultStr.toString();
    }

    private boolean canBeExactedDividedBy(int position, int i) {
        return position % i == 0;
    }
}
