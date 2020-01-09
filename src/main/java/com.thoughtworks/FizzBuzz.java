package com.thoughtworks;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";

    public String say(int position) {
        StringBuffer resultStr = new StringBuffer();
        if (canBeExactedDividedBy(position, 3)) {
            resultStr.append(FIZZ);
        }
        if (canBeExactedDividedBy(position, 5)) {
            resultStr.append("Buzz");
        }
        if (canBeExactedDividedBy(position, 7)) {
            resultStr.append("Whizz");
        }
        if (String.valueOf(position).contains("3")) {
            return FIZZ;
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
