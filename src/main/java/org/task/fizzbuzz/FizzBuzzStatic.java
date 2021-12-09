package org.task.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzStatic {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public List<String> generate(int bound) {
        List<String> output = new ArrayList<>(bound);

        for (int i = 1; i <= bound; i++) {
            if (i % 3 == 0) {
                output.add(FIZZ);
            } else if (i % 5 == 0) {
                output.add(BUZZ);
            } else {
                output.add(Integer.toString(i));
            }
        }

        return output;
    }
}
