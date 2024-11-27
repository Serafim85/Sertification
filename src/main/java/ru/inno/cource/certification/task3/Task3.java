package ru.inno.cource.certification.task3;

import java.util.Arrays;
import java.util.Collections;

/**
 * Второй элемент
 * Напишите программу, которая находит в массиве чисел второй по величине
 * элемент.
 * Например, для массива [1,5,7,3,2,0,4,9,6], программа выведет 7, потому что
 * самый большой элемент - 9, а, после него, 7.
 */
public class Task3 {
    public static void main(String[] args) {
        Integer[] numbers = {1,5,7,3,2,0,4,9,6};
        int largestElement = 2;
        System.out.println("Наибольший элемент номер " + largestElement + ": " +
                findLargestNumber(numbers, largestElement));
    }
    public static int findLargestNumber(Integer[]numbers,int largestElement){
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
        return numbers[largestElement-1];
    }
}
