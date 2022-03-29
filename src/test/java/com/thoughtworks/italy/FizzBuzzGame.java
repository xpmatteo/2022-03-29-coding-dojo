package com.thoughtworks.italy;

import java.util.HashSet;
import java.util.Set;

public class FizzBuzzGame {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private Set<String> answers = new HashSet<>();

    public String say(int inputNumber) {
        String returnNumber = "";

        if(inputNumber == 13){
            answers.add(FIZZ);
            return FIZZ;
        }
        if (isDivisibleBy(inputNumber, 3)){
            answers.add(FIZZ);
            returnNumber += FIZZ;
        }
        if (isDivisibleBy(inputNumber, 5)){
            answers.add(BUZZ);
            returnNumber += BUZZ;
        }
        if (returnNumber.isEmpty()){
            return String.valueOf(inputNumber);
        }
        return answers.stream().reduce("",(s,s2) -> s + s2);
    }

    private boolean isDivisibleBy(int input, int divisor) {
        return input % divisor == 0;
    }
}
