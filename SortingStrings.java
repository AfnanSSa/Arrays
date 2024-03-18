/* Sorting Strings
* Implement the Selection Sort algorithm in a Java method called selectionSortStrings
* to sort an array of strings in alphabetical order. This task requires an approach to
* compare and arrange strings, taking into account their alphabetical sequence while
* considering case sensitivity. The goal is to enhance your understanding of sorting
* algorithms, specifically Selection Sort, and their application to sorting arrays of
* non-numeric data.
* Requirements:
* Input: An array of strings, potentially containing both uppercase and lowercase letters
* Output: The same array where the strings have been sorted in alphabetical order, respecting
* case sensitivity
* Implement the Selection Sort algorithm manually; do not use Java's built-in sorting methods.
* Test your method with an array containing a mix of uppercase and lowercase letters to verify
* that your sorting algorithm considers case sensitivity correctly.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsSort {
    public static void main(String[] args) {
        //creating an array list
        List<String> stringArray = new ArrayList<>();
        stringArray.addAll(Arrays.asList("banana", "Apple", "cherry", "blueberry", "Elderberry"));

        //printing the original array list
        System.out.print("\nOriginal Array: " + stringArray);

        //sorting elements alphabetically using selectionSortStrings() method
        selectionSortStrings(stringArray);

        //printing the sorted array
        System.out.print("\nSorted Array: " + stringArray);

    }

    //method to sort array elements alphabetically
    public static void selectionSortStrings(List<String> stringArray) {
        Integer arraySize = stringArray.size();

        //iterating through array
        for (Integer i = 0; i < arraySize; i++) {
            //assuming the first string is the first in the alphabetical order

            //comparing strings
            for (Integer j = i + 1; j < arraySize; j++) {

                //compare the current element to remaining elements using compareTo() method
                //compareTo(): compares strings on the basis of the Unicode value of each character in the strings.
                if ((stringArray.get(i)).compareTo(stringArray.get(j)) > 0) {
                    
                    //swapping/replacing values using set() method
                    String temporary = stringArray.get(i);
                    stringArray.set(i, stringArray.get(j));
                    stringArray.set(j, temporary);

                }
            }
        }
    }
}
