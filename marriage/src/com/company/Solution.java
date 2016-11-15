package com.company;


import java.util.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by gulnur on 10.10.16.
 */

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        char t = '\n';
        String s = String.valueOf(t);
        while (scanner.hasNext() && scanner.next()!= s) {
            String next = scanner.next();
            if (map.containsKey(next) == false) {
                map.put(next, 1);
            } else {
                map.put(next, map.get(next) + 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Integer maxx = 0;
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (maxx < value) {
                maxx = value;
            }
        }
        System.out.println(maxx);
    }
}