package com.example.sample.controller.others.nike.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Write a method that shuffles a deck of cards. It must be a perfect shuffle –
//        in other words, each of the 52! permutations of the deck has to be equally likely.
//        Assume you are given a random number generator which is perfect.
//        Rajith.raveendranath@nike.com
public class ShuffleDeckOfCards {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<52; i++) {
            list.add(i+1);
        }
        shuffle(list);
        shuffle(list);
    }

    private static void shuffle(List input) {
        Collections.shuffle(input, new Random(52));
        System.out.println("after Random: "+input);
    }
}
