package org.example.functions;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Division implements BiFunction<Long, Long, Long> {
Rest rest = new Rest();

    @Override
    public Long apply(Long cociente, Long divisor ) {
        return Optional.of(divisor)
        .filter(num ->num>cociente)
        .map(num->0L)
        .orElseGet(()->apply(rest.apply(cociente, divisor),divisor)+1);
    }
}

