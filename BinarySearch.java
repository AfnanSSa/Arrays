/* Implementing Binary Search in Java
 *Objective:
 * Develop a Java program that implements binary search on a sorted array of integers.
 * The program should find the position of a target value within the array.
 * Requirements:
 * Binary Search Implementation: Use the binary search algorithm to locate the target value.
 * Sorted Array Input: Assume the input array is already sorted in ascending order.
 * Input Handling: The program should accept an array of integers and the target value to search for.
 * Output: The program should output the index of the target value if it is found in the array. If the
 * target is not found, output a message indicating so.
 * Non-negative Integer Assumption: Assume all array elements and the target value are non-negative integers.
 * Error Handling: Implement basic error handling for edge cases, such as an empty array input. */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer lengthOfArray = 0;

        while (true) {
            /*Input Handling*/
            try {
                //prompting user to enter the length of array
                System.out.println("\nEnter length of array: ");
                lengthOfArray = scanner.nextInt();
                //checking if length input is a positive number
                if (lengthOfArray <= 0) {
                    System.out.println("\nEnter a positive number");
                } else {
                    break; //quitting the statement if length is a positive number
                }
            } catch (InputMismatchException exception) { //if input is not an integer
                System.out.println("\nInvalid Input! Enter a positive integer: ");
                scanner.next(); //clearing invalid input
            }
        }

        //prompting user to enter array's elements
        System.out.println("\nEnter " + lengthOfArray + " Numbers: ");
        Integer[] numArray = new Integer[lengthOfArray];

        //storing elements in array
        for (Integer i = 0; i <= lengthOfArray - 1; i++) {
            while (true) {
                /*Input Handling*/
                try {
                    //prompting user to enter elements
                    System.out.println("\nEnter number " + (i + 1) + ": ");
                    Integer element = scanner.nextInt();
                    if (element <= 0) { //if input was a negative value
                        System.out.println("Enter a positive number");
                    } else { //if input is valid
                        numArray[i] = element; //adding elements to array
                        break;
                    }
                } catch (InputMismatchException exception) { //if input is a string
                    System.out.println("\nInvalid Input! Enter a positive integer: ");
                    scanner.next(); //clearing invalid input
                }

            }
        }

        Arrays.sort(numArray); //sorting array
        System.out.println("\nSorted Array: " + Arrays.toString(numArray)); //printing the sorted array

        //prompting user to enter number to find in array
        System.out.println("Enter a number to search for: ");
        Integer numberToFind = scanner.nextInt();

        //applying binarySearch method
        binarySearch(numArray, numberToFind);
    }

    public static void binarySearch(Integer array[], Integer numberToFind) {
        //first and last elements in array
        Integer firstIndex = 0;
        Integer lastIndex = array.length - 1;

        //compare middleIndex to the numberToFind
        while (firstIndex <= lastIndex) {
            //calculating the middle index -> (firstIndex + lastIndex)/2
            Integer middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] < numberToFind) {

                firstIndex = middleIndex + 1; //eliminating useless numbers according to comparison

            } else if (array[middleIndex].equals(numberToFind)) { //if middleIndex is the number that are searched for
                System.out.println("\nElement is found in index " + middleIndex);
                return;
            } else {
                lastIndex = middleIndex - 1; //eliminating useless numbers according to comparison
            }
        }

        if (firstIndex > lastIndex) {
            System.out.println("\nElement is not found!");
        }
    }
}
