package com.groupqa1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        if(length <= 0){
            System.out.print("Enter the number bigger than 0: " );
            length = sc.nextInt();
        }
        task1(length);
        task2(length);
        task3(length);
        task4(length);

        extraTask1(length);
        System.out.print("\n\nEnter size of 2nd array for extra task 2: ");
        int length2 = sc.nextInt();
        if(length2 <= 0){
            System.out.print("Enter the number bigger than 0: " );
            length2 = sc.nextInt();
        }
        extraTask2(length, length2);
        extraTask3(length);

    }

    private static void task1(int length) {
        int[] array = createArray(length);
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("\nReversed array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    private static void task2(int length) {
        int[] array = createArray(length);
        int count = 0;
        int sum = 0;


        System.out.print("\n\nArray for task 2: " + Arrays.toString(array));
        for (int i : array) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("\nNumber of odd elements: " + count + "\nSum of odd elements: " + sum);
    }

    private static void task3(int length) {
        int[] array1 = createArray(length);
        int[] array2 = createArray(length);
        int[] res = new int[length];

        System.out.println("\n\nArray 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        for (int i = 0; i < length; i++) {
            res[i] = array1[i] + array2[i];
        }
        System.out.println("Result array: " + Arrays.toString(res));
    }

    private static void task4(int length) {
        int[] array = createArray(length);
        int[] positive = new int[length];
        int[] negative = new int[length];
        int numOfPositive = 0;
        int numOfNegative = 0;


        System.out.println("\n\nArray for task 4: " + Arrays.toString(array));
        for (int i : array) {
            if (i > 0) {
                positive[numOfPositive] = i;
                numOfPositive++;
            } else if (i < 0) {
                negative[numOfNegative] = i;
                numOfNegative++;
            }
        }

        positive = copyOf(positive, numOfPositive);
        negative = copyOf(negative, numOfNegative);
        System.out.println("Positive array: " + Arrays.toString(positive));
        System.out.println("Negative array: " + Arrays.toString(negative));
    }

    private static void extraTask1(int length){
        int[] array = createArray(length);
        double avg = 0;
        int biggerThanAvgNum = 0;

        for (int i : array) {
            avg += i;
        }
        avg /= array.length;

        for (int i : array) {
            if (i > avg) {
                biggerThanAvgNum++;
            }
        }
        System.out.println("\n\nArray for extra task 1: " + Arrays.toString(array));
        System.out.println("Average: " + avg);
        System.out.println("Count of numbers bigger than average: " + biggerThanAvgNum);
    }

    private static void extraTask2(int length1, int length2){
        int[] array1 = createArray(length1);
        int[] array2 = createArray(length2);
        int[] res = new int[array1.length + array2.length];

        for(int i = 0; i<array1.length; i++){
            res[i] = array1[i];
        }
        for(int i = 0; i< array2.length; i++){
            res[i+array1.length] = array2[i];
        }
        System.out.println("\n\nArray 1:" + Arrays.toString(array1));
        System.out.println("Array 2:" + Arrays.toString(array2));
        System.out.println("Result array:" + Arrays.toString(res));

    }

    private static void extraTask3(int length){
        int[] array = createArray(length);
        int[] res = new int[array.length];
        int min = 0;
        int max = 0;
        boolean firstMin = true;
        boolean firstMax = true;
        int count = 0;

        System.out.println("\n\nArray for extra task 3: " + Arrays.toString(array));
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        for(int i = 0; i<array.length; i++){
            if(array[i] == min && firstMin){
                res[i] = array[i];
                firstMin = false;
                count++;
            } else if(array[i] == max && firstMax) {
                res[i] = array[i];
                firstMax = false;
                count++;
            } else if(array[i] != min && array[i] != max){
                res[i] = array[i];
                count++;
            }
        }

        res = copyOf(res, count);
        System.out.println("Result aray: " + Arrays.toString(res));
    }

    private static int[] createArray(int length) {
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(201) - 100;
        }
        return array;
    }
}
