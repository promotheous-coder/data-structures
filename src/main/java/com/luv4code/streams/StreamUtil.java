package com.luv4code.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamUtil {
    public static int findSecondHighestNumber(int[] arr) {
        Integer result = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().get();
        return result;
    }

    public static void findEmployeeWithHighestSalaryInEachDept() {
        List<Employee> employeeList = EmployeeDatabase.getEmployeeList();
        Map<String, Optional<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        System.out.println(map);
        System.out.println();
    }

    public static List<String> findElementsStartWithGivenValue(int[] arr) {
        List<String> list = Arrays.stream(arr)
                .boxed()
                .map(n -> n + "")
                .filter(n -> n.startsWith("2"))
                .collect(Collectors.toList());
        return list;
    }

    public static String findLongestString(String[] arr) {
//        String longestString = Arrays.stream(arr).max(Comparator.comparingInt(String::length)).get();
        String longestString = Arrays.stream(arr).reduce((x, y) -> x.length() > y.length() ? x : y).get();
        return longestString;
    }

    public static String findFirstNonRepeatedChar(String str) {
        LinkedHashMap<String, Long> collect = Arrays.stream(str.split(""))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        return collect.entrySet().stream().filter(e -> e.getValue() == 1)
                .map(e -> e.getKey()).findFirst().get();
    }

    public static List<String> findAllDuplicateElements(String str) {
        List<String> duplicateElements = Arrays.stream(str.split(""))
                .map(e -> e.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        return duplicateElements;
    }
}
