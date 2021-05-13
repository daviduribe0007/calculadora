package org.example.functions;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Multiplication implements BiFunction<Long, Long, Long> {


    @Override
    public Long apply(Long numero, Long cantidad){
        return Long.valueOf(IntStream.range(1, Math.toIntExact(cantidad)).reduce(Math.toIntExact(numero),
                (s1, s2)-> Math.toIntExact(new Sum().apply(Long.parseLong(numero.toString()),
                        Long.parseLong(numero.toString(s1))))));
    }
}
