package org.task.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private final FizzBuzz FizzBuzz = new FizzBuzz();

    @Test
    void testStaticFizzBuzz() {
        // given
        int bound = 15;

        // expect
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "Fizz");

        // when
        List<String> actual = FizzBuzz.generate(bound);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
