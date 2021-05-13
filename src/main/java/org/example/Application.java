package org.example;

import org.example.functions.Division;
import org.example.functions.Multiplication;
import org.example.functions.Rest;
import org.example.functions.Sum;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;

public class Application {

    public static void main (String[] args){
        var operation = "*";
        Map<String,BiFunction<Long,Long,Long>> operators = new HashMap<>();
        operators.put("+",new Sum());
        operators.put("-",new Rest());
        operators.put("*",new Multiplication()) ;
        operators.put("/",new Division()) ;
        var  r = Optional.of(operation).map(operators::get).orElseThrow(()->
                new IllegalArgumentException("the operation no exist")
        );
        System.out.println(r.apply(12l,4l));

    }
}
