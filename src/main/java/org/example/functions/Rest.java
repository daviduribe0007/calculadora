package org.example.functions;

import java.util.function.BiFunction;

public class Rest implements BiFunction<Long, Long, Long> {

    @Override
    public Long apply(Long a, Long b) {
        return a - b;
    }
}
