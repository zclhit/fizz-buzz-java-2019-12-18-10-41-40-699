package com.thoughtworks;

public class FizzBuzz {
    public String say(int position) {
        if (canBeExactedDividedBy(position, 3)) {
            return "Fizz";
        }
        if (canBeExactedDividedBy(position, 5)) {
            return "Buzz";
        }
        if (canBeExactedDividedBy(position, 7)) {
            return "Whizz";
        }
        return String.valueOf(position);
    }

    private boolean canBeExactedDividedBy(int position, int i) {
        return position % i == 0;
    }
}
