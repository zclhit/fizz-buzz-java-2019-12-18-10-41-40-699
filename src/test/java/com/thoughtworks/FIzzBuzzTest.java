package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FIzzBuzzTest {
    @Test
    public void should_return_1_given_student_of_position_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.say(1));
    }
}
