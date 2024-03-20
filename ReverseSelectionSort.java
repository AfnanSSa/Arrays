/* Implement Reverse Selection Sort in Java
* Objective:
* Develop a Java program that reverse implements the Selection Sort algorithm
* to sort an array of integers in ascending order.
* Requirements:
* The program should define an integer array with hardcoded values for sorting.
* Implement the Selection Sort algorithm to sort the array in descending order.
* The sorting logic should be encapsulated in a method named selectionSort.
* After sorting, the array should be printed to the console to display the sorted order.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSelectionSort {
    public static void main(String[] args){
        //creating an array list
        List<Integer> originalArray = new ArrayList<>();

        //adding integers to the array list
        originalArray.addAll(Arrays.asList(21, 6, 90, 50, 65, 10));

        //printing array list
        System.out.println("\nOriginal Array: " + originalArray);

        //sort in descending order
        reverseSelectionSort(originalArray);

        //print array list after sorting
        System.out.print("\nSorted Array (reverse): " + originalArray);
    }

    //method to sort array in reverse
    public static void reverseSelectionSort(List<Integer> arrayToSort){
        Integer size = arrayToSort.size(); //size of array list

        //iterating through array list
        for (Integer i=0; i<size; i++){
            Integer maximum = i; // assuming the first element in array has the greatest value

            for (Integer j=i; j<size; j++){
                //comparing values
                if (arrayToSort.get(j) > arrayToSort.get(maximum)){
                    maximum = j;
                }
            }
            //swapping values
            Integer temporary = arrayToSort.get(i);
            arrayToSort.set(i, arrayToSort.get(maximum));
            arrayToSort.set(maximum, temporary);
        }
    }
}
