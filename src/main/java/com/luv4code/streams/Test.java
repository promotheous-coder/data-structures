package com.luv4code.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> listMap = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        List<Integer> evenNumbers = listMap.get(true);
        List<Integer> oddNumbers = listMap.get(false);

        System.out.println("Even Numbers: "+evenNumbers);
        System.out.println("Odd Numbers: "+oddNumbers);
    }
}
