package com.thoughtworks;

public class FizzBuzz {
    public String say(int position) {
        if (position % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(position);
    }
}
