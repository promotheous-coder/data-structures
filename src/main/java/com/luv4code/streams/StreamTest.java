package com.luv4code.streams;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        //find second highest number
        int secondHighestNumber = StreamUtil.findSecondHighestNumber(new int[]{23, 54, 12, 67, 45, 98, 98, 76});
        System.out.println("Second Highest Number: " + secondHighestNumber);

        //find employee with highest salary in each department
        StreamUtil.findEmployeeWithHighestSalaryInEachDept();

        //Find all elements starts with "2"
        List<String> stringList = StreamUtil.findElementsStartWithGivenValue(new int[]{23, 56, 21, 29, 34, 16});
        System.out.println("Elements Start's with given number: " + stringList);

        //Find the longest string in given array
        String[] names = {"Madhava", "Suresh", "Ramesh", "Venkatesh", "Satyanarayana"};
        System.out.println("Longest String: " + StreamUtil.findLongestString(names));

        //Find the first non-repeated character in given string
        System.out.println("First Not Repeated Character: " + StreamUtil.findFirstNonRepeatedChar("gainjavaknowledge"));

        //Find All Duplicate Elements
        List<String> allDuplicateElements = StreamUtil.findAllDuplicateElements("gainjavaknowledge");
        System.out.println("Duplicate Elements: " + allDuplicateElements);
    }
}
