package com.example.sample.controller.others.nike.examples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  1,2,3,4,5,6
// find median dynamically by passing random integers to the method
public class MedianExample {
    static List<Integer> list = new ArrayList();
    public static void main(String[] args) {

        findMedian(5);
        findMedian(7);
        findMedian(2);
        findMedian(4);
    }

    private static void findMedian(int input) {

        list.add(input);
        Collections.sort(list);
        int size = list.size();
        System.out.println("size: "+size);
        double d = size/2;

        if(size%2!=0) {
            int midElement = (int) d;
            System.out.println("midElement: "+list.get(midElement));
        } else {
            System.out.println(d);
            int midElement = (int) d;
            System.out.println(list.get(midElement-1)+" : "+list.get(midElement));
            double me = (list.get(midElement-1)+list.get(midElement));
            System.out.println("midElement: "+(double)me/2);
        }
    }
}
