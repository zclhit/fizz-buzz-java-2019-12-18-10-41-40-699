package com.thoughtworks;

public class FizzBuzz {
    public String say(int position) {
        StringBuffer resultStr = new StringBuffer();
        if (canBeExactedDividedBy(position, 3)) {
            resultStr.append("Fizz");
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
