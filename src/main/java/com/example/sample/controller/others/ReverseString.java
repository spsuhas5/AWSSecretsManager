package com.example.sample.controller.others;

import java.util.Objects;

public class ReverseString {

    public static void main(String[] args) {
//        reverse("reverse");
        System.out.println(reverseRecursively("reverse"));
    }

    private static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    private static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (Objects.isNull(str) || str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }


}
