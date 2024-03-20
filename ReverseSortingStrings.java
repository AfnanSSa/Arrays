/* Reverse Sorting Strings
 * Implement the Selection Sort algorithm in a Java method called selectionSortStrings
 * to sort an array of strings in reverse alphabetical order. This task requires an
 * approach to compare and arrange strings, taking into account their reverse alphabetical
 * sequence while considering case sensitivity. The goal is to enhance your understanding of
 * sorting algorithms, specifically Selection Sort, and their application to sorting arrays
 * of non-numeric data
 * Requirements:
 * Input: An array of strings, potentially containing both uppercase and lowercase letters.
 * Output: The same array where the strings have been sorted in reverse alphabetical order,
 * respecting case sensitivity.
 * Implement the Selection Sort algorithm manually; do not use Java's built-in sorting methods.
 * Test your method with an array containing a mix of uppercase and lowercase letters to verify
 * that your sorting algorithm considers case sensitivity correctly.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringSort {
    public static void main(String[] args) {

        //creating array list
        List<String> stringArray = new ArrayList<>();
        //adding elements in array list
        stringArray.addAll(Arrays.asList("banana", "Apple", "cherry", "blueberry", "Elderberry", "orange", "Grapes"));

        //printing array list
        System.out.print("\nOriginal Array: " + stringArray);

        //sorting array list's elements in reverse
        reverseSortStrings(stringArray);

        //printing sorted array list
        System.out.print("\nSorted Array (reverse): " + stringArray);

    }

    //method to sort array list in reverse
    public static void reverseSortStrings(List<String> arrayToReverse) {

        Integer size = arrayToReverse.size(); //size of array list

        //iterating through the array list
        for (Integer i = 0; i < size; i++) {

            //comparing strings
            for (Integer j = i; j < size; j++) {
                //comparing elements using compareTo() method
                if (arrayToReverse.get(j).compareTo(arrayToReverse.get(i)) > 0) {

                    //swapping and updating the values
                    String temporary = arrayToReverse.get(i);
                    arrayToReverse.set(i, arrayToReverse.get(j));
                    arrayToReverse.set(j, temporary);

                }
            }
        }
    }
}
