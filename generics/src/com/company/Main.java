package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {


        CountMap<Integer> map = new CountMapIml<>();
        CountMap<Integer> map1 = new CountMapIml<>();

        map.add(10);

        map.add(10);

        map.add(2);
        map.add(3);
        map.add(4);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);


        int c = map.getCount(5);
        int c1 = map.getCount(6);
        int c2 = map.getCount(10);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

    }
}
