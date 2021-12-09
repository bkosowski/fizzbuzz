package org.task.fizzbuzz;

import java.util.*;

public class FizzBuzzDynamic {

    public List<String> generate(int bound, Map<Integer, String> divisorToToken) {
        validate(bound, divisorToToken);

        Map<Integer, String> sorted = sorted(divisorToToken);

        List<String> output = new ArrayList<>(bound);
        boolean divided;

        for (int i = 1; i <= bound; i++) {
            divided = false;
            for (Map.Entry<Integer, String> dt : sorted.entrySet()) {
                if (i % dt.getKey() == 0) {
                    output.add(dt.getValue());

                    divided = true;
                    break;
                }
            }

            if (!divided) {
                output.add(Integer.toString(i));
            }
        }

        return output;
    }

    private void validate(int bound, Map<Integer, String> divisorToToken) {
        if (bound < 1) {
            throw new IllegalArgumentException("Upper bound must be greater than or equal 1");
        }

        if (divisorToToken.keySet().stream().anyMatch(k -> k < 1)) {
            throw new IllegalArgumentException("Cannot have divisors lower than 1");
        }
    }

    private Map<Integer, String> sorted(Map<Integer, String> input) {
        TreeMap<Integer, String> sorted = new TreeMap<>(Integer::compare);
        sorted.putAll(input);
        return sorted;
    }
}
