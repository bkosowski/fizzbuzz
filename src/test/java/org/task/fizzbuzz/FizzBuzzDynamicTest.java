package org.task.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FizzBuzzDynamicTest {
    private final FizzBuzzDynamic fizzBuzz = new FizzBuzzDynamic();

    @Test
    void replicatesStaticBehavior() {
        // expect
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "Fizz");

        // when
        List<String> actual = fizzBuzz.generate(15, Map.of(3, "Fizz", 5, "Buzz"));

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void correctlyHandlesEmptyMap() {
        // expect
        List<String> expected = List.of("1", "2", "3", "4", "5");

        // when
        List<String> actual = fizzBuzz.generate(5, Map.of());

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void throwsWhenMapContainsZero() {
        // when & then
        assertThatThrownBy(() -> fizzBuzz.generate(5, Map.of(0, "Ooopsie")))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void handlesDivisorsLargerThanBound() {
        // expect
        List<String> expected = List.of("1", "2", "3", "4", "5");

        // when
        List<String> actual = fizzBuzz.generate(5, Map.of(12, "Twelve"));

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void handlesBoundOfOne() {
        // expect
        List<String> expected = List.of("One");

        // when
        List<String> actual = fizzBuzz.generate(1, Map.of(1, "One"));

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void throwsWhenProvidedBoundLowerThanOne() {
        // when & then
        assertThatThrownBy(() -> fizzBuzz.generate(0, Map.of(2, "Two")))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
