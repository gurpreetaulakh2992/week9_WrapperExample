package com.gurpreet;

import java.util.Locale;

public class Week09 {
    public static void main(String[] args) {
        String str="Welcome to Lambton College";
        System.out.println("Length: " +str.length());
        str=str.concat("Toronto"); //not mutuable
//        str=str.concat("to the week09 class"); //this will concat
//        str=str.toUpperCase();
        System.out.println(str);
        //Extract the word week09
        String find="Lambton";
        int indexOfFindString=str.indexOf(find);
        String str1;
        str1 = str.substring(indexOfFindString,indexOfFindString+7);
        System.out.println(str1);
        //check the word college exist or not
        String wordToFind="College";
        System.out.println(str.contains(wordToFind));
        if(str.indexOf(wordToFind)>=0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
