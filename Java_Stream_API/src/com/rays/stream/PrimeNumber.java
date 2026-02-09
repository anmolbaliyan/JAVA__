package com.rays.stream;

import java.util.stream.IntStream;

public class PrimeNumber {

    // function to check whether a number is prime
    static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        return IntStream.range(2, number)   // check from 2 to number-1
                        .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {

        int limit = 20;

        IntStream.rangeClosed(1, limit)
                 .filter(PrimeNumber::isPrime) // calling function
                 .forEach(System.out::println);
    }
}