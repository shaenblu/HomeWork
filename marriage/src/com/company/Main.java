package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person Lucas = new Person(true, "Lucas");
        Person Zoe = new Person(false, "Zoe");
        Person Francis = new Person(true, "Francis");
        Person Claire = new Person(false, "Claire");
        Person Peter = new Person(true, "Peter");
        Person Christina = new Person(false, "Christina");

        /*
        System.out.println(Francis.marry(Claire));
        System.out.println(Claire.marry(Lucas));

        System.out.println(Francis.marry(Zoe));

        System.out.println(Francis.divorce());
        System.out.println(Francis.marry(Zoe));

        System.out.println(Claire.marry(Lucas));
        System.out.println(Zoe.marry(Lucas));
        */
        Solution.solution();

    }
}



