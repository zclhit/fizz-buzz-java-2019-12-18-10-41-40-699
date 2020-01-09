package com.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FIzzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_1_given_position_1() {
        assertEquals("1", fizzBuzz.say(1));
    }

    @Test
    public void should_return_fizz_given_position_3() {
        assertEquals("Fizz", fizzBuzz.say(3));
    }
}
