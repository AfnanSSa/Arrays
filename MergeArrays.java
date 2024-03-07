/* Merge K Sorted Arrays
* Develop a Java program to merge k sorted arrays of variable lengths into a single
* sorted array. This task requires efficiently combining all the elements from the
* given arrays into a new array while maintaining the sorted order.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        List<List<Integer>> originalArray = new ArrayList<>(); //creating a list to hold lists of arrays
            originalArray.add(Arrays.asList(1, 4, 5));
            originalArray.add(Arrays.asList(1, 3, 4));
            originalArray.add(Arrays.asList(2, 6, 7));

        int numberOfInternalArrays = 3; //number of array lists
        int numberOfElements = 3; //number of elements inside each array list

        //creating another list to hold merged array lists
        List<Integer> outputArray = new ArrayList<>(numberOfElements * numberOfInternalArrays);

        //merging array lists
        mergeArrays(originalArray, numberOfInternalArrays, outputArray);

        //sorting array list
        outputArray.sort(null);

        //printing result
        System.out.print("\nMerged Array:");
        printArray(outputArray);
    }

    //method to merge array lists
    public static void mergeArrays(List<List<Integer>> originalArray, int num, List<Integer> outputArray) {
        for (int i = 0; i < num; i++) {
            outputArray.addAll(originalArray.get(i)); //access the correct internal array using index i
        }
    }

    //method to print the merged array list
    public static void printArray(List<Integer> outputArray) {
        for (Integer num : outputArray) {
            System.out.print(num + " ");
        }
    }
}
