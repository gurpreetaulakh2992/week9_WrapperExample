package com.gurpreet;

import java.util.Locale;

public class Week09 {
    public static void main(String[] args) {
        String str="Welcome";
        System.out.println("Length" +str.length());

        str.concat("to week09 class"); //not mutuable
        str=str.concat("to the week09 class"); //this will concat
        str=str.toUpperCase();
        System.out.println(str);
    }
}
