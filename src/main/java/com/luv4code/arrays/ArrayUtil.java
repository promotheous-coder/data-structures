package com.luv4code.arrays;

import java.util.Arrays;

public class ArrayUtil {

    public static int[] removeEvenIntegers(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int resultArray[] = new int[oddCount];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                resultArray[idx++] = arr[i];
            }
        }
        return resultArray;
    }

    public static int[] reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayElements(int[] arr) {
        Arrays.stream(arr).boxed().forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    public static void initializeArray() {
        int[] myArr = new int[5];
        myArr[0] = 5;
        myArr[1] = 11;
        myArr[2] = 2;
        myArr[3] = 3;
        myArr[4] = 8;
        myArr[2] = 9;
        printArray(myArr);
        System.out.println("Accessing Element: " + myArr[3]);
        System.out.println("Array Length: " + myArr.length);
        System.out.println("Accessing Last Element: " + myArr[myArr.length - 1]);
//        myArr[5] = 10;
        int[] arr1 = {5, 6, 2, 9};
        printArrayElements(arr1);
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findSecondMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {42, 19, 72, 96, 21, 44, 76};
        int[] resultArray = removeEvenIntegers(arr);
        printArrayElements(resultArray);

        System.out.println("Reverse an Array: ");
        printArray(reverseArray(arr, 0, arr.length - 1));

        System.out.println("Minimum Value: "+findMinValue(arr));

        System.out.println("Second Max Value: "+findSecondMaxValue(new int[] {34,25,17,43,34,43,43}));

    }
}
