package com.ex01module2;

import java.util.Scanner;

public class Main {


    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        int number;
        int[] array = new int[0];
        int index;
        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Check for positive odd numbers.");
            System.out.println("2. Check for prime number.");
            System.out.println("3. List prime number.");
            System.out.println("4. Creates an array of n elements and show.");
            System.out.println("5. Lists the primes in the array just entered.");
            System.out.println("6. Check for prime number in array.");
            System.out.println("7. Check value in array.");
            System.out.println("8. Remove value in array.");
            System.out.println("9. Sorts the elements of the imported array at 4 in ascending order.");
            System.out.println("10. Enter 1 X number, insert X into the sort array in step 7 so as not to change the sort order of the array.");
            System.out.println("0. Exit.");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.print("Enter a number: ");
                        number = scanner.nextInt();
                    } while (number < 0 || number % 2 == 0);
                    System.out.println(number + " is a positive odd numbers");

                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    number = scanner.nextInt();
                    boolean bool = isPrime(number);
                    if (bool == true) {
                        System.out.print(number + " is a prime");
                    } else
                        System.out.print(number + " is not a prime");
                    break;
                case 3:
                    System.out.print("Enter n primes you want to display: ");
                    number = scanner.nextInt();

                    int count = 0;
                    int n = 2;
                    String str = " ";

                    while (count < number) {
                        int i = 2;
                        boolean flag = true;
                        while (i <= Math.sqrt(n)) {
                            if (n % i == 0) {
                                flag = false;
                                break;
                            }
                            i++;
                        }
                        if (flag) {
                            str += n + " ";
                            count++;
                        }
                        n++;
                    }
                    System.out.print(str);
                    break;
                case 4:
                    int num;
                    do {
                        System.out.print("Enter the number of elements in an array: ");
                        num = scanner.nextInt();

                    } while (num < 0);
                    array = new int[num];

                    for (int j = 0; j < num; j++) {
                        System.out.print("Enter element " + (j + 1) + " : ");
                        array[j] = scanner.nextInt();
                    }
                    break;
                case 5:
                    System.out.print("Show array: ");
                    for (int a : array) {
                        System.out.print(a + " ");
                    }
                    break;
                case 6:
                    String s = " ";
                    for (int i = 0; i < array.length; i++) {
                        if (isPrime(array[i])) {
                            s += array[i] + " ";
                        }
                    }
                    System.out.print("Prime in array: " + s);
                    break;
                case 7:
                    System.out.print("Enter value to check in array: ");
                    int k = scanner.nextInt();
                    int i;
                    for (i = 0; i < array.length; i++) {
                        if (array[i] == k) {
                            System.out.println("There is an element " + k + " in the array and is located " + i);
                            break;
                        }
                    }
                    if (i == array.length) {
                        System.out.println("There is no element k in the array");
                    }
                    break;
                case 8:
                    int b, c;
                    System.out.print("Enter the value to be deleted: ");
                    int d = scanner.nextInt();
                    for (b = c = 0; b < array.length; b++) {
                        if (array[b] != d) {
                            array[c] = array[b];
                            c++;
                        }
                    }
                    System.out.print("Array remaining after the element " + d + " is deleted: ");
                    for (int a : array) {
                        System.out.print(a + " ");
                    }
                    break;
                case 9:
                    int temp = array[0];
                    for (int j = 0; j < array.length; j++) {
                        for (int l = j + 1; l < array.length; l++) {
                            if (array[j] > array[l]) {
                                temp = array[j];
                                array[j] = array[l];
                                array[l] = temp;
                            }
                        }
                    }
                    System.out.print("sorts the array in ascending order: ");
                    for (int a : array) {
                        System.out.print(a + " ");
                    }
                    break;
                case 10:
                    System.out.print("Enter the value want insert: ");
                    int value = scanner.nextInt();
                    System.out.print("Enter index of value want insert: ");
                    index = scanner.nextInt();
                    if (index < 0 || index > array.length) {
                        System.out.println("The array does not have this location");
                    } else {
                        for (int j = args.length; j >= index; j--) {
                            array[j] = array[j - 1];
                        }
                        array[index] = value;
                        System.out.println("Array after inserting: ");
                        for (int a : array) {
                            System.out.print(a + " ");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}



