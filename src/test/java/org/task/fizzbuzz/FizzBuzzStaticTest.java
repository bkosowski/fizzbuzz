package org.task.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzStaticTest {
    private final FizzBuzzStatic fizzBuzz = new FizzBuzzStatic();

    @Test
    void testStaticFizzBuzz() {
        // given
        int bound = 15;

        // expect
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "Fizz");

        // when
        List<String> actual = fizzBuzz.generate(bound);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
