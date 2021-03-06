package com.thoughtworks;

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

    @Test
    public void should_return_number_of_position_given_position_can_not_be_exact_divided_by_3() {
        assertEquals("2", fizzBuzz.say(2));
    }

    @Test
    public void should_return_fizz_given_position_can_be_exacted_divided_by_3() {
        assertEquals("Fizz", fizzBuzz.say(6));
    }

    @Test
    public void should_return_buzz_given_position_can_be_exacted_divided_by_5() {
        assertEquals("Buzz", fizzBuzz.say(5));
    }

    @Test
    public void should_return_whizz_given_position_can_be_exacted_divided_by_7() {
        assertEquals("Whizz", fizzBuzz.say(7));
    }

    @Test
    public void should_return_FizzBuzz_given_15() {
        assertEquals("FizzBuzz", fizzBuzz.say(15));
    }

    @Test
    public void should_return_BuzzWhizz_given_35() {
        assertEquals("BuzzWhizz", fizzBuzz.say(35));
    }

    @Test
    public void should_return_FizzWhizz_given_21() {
        assertEquals("FizzWhizz", fizzBuzz.say(21));
    }

    @Test
    public void should_return_Fizz_given_number_contains_3() {
        assertEquals("Fizz", fizzBuzz.say(13));
    }

    @Test
    public void should_return_Fizz_given_73() {
        assertEquals("Fizz", fizzBuzz.say(73));
    }
}
