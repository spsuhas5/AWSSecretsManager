package com.example.sample.controller.others.nike.examples;

import java.util.stream.Stream;

//find unique elements in an array
public class UniqueElementsInArray {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 2, 3, 4, 4, 5};

        Stream.of(intArray).distinct().forEach(System.out::println);

    }
}
