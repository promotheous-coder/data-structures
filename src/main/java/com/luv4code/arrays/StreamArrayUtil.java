package com.luv4code.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamArrayUtil {
    public static void main(String[] args) {
        int[] myArr = new int[]{1, 2, 3, 4, 8, 9, 7, 5, 9, 9, 9};
        //removing even elements
        printArrayElements(removeEvenNumbers(myArr));

        //reverse array
        System.out.println("Reverse Array: ");
        printArrayElements(reverseArray(myArr));

        //find min value
        System.out.println("Minimum Value: " + findMinValue(myArr));

        //find second max value
        System.out.println("SecondMax Value: " + findSecondMaxValue(myArr));
    }

    public static int findMinValue(int[] arr) {
        return IntStream.of(arr).min().getAsInt();
    }

    public static int findSecondMaxValue(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
    }

    public static int[] reverseArray(int[] arr) {
        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeEvenNumbers(int[] arr) {
        int[] resultArray = Arrays.stream(arr)
                .boxed()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue).toArray();
        return resultArray;
    }

    public static void printArrayElements(int[] arr) {
        Arrays.stream(arr).boxed().forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
